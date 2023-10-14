const h = require('virtual-dom/h');
const createElement = require('virtual-dom/create-element');

export default class Element {

    #id = null
    #tree = null
    #classes = []
    #type = null
    #properties = []
    #propertyMap = []
    #variables = []

    constructor(json, state = {}) {
        const obj = (json instanceof String) ? JSON.parse(json) : json
        this.#id = obj.id
        this.#propertyMap = obj.properties ?? []
        this.#properties = this.#props(state)
        this.#classes = obj.classes ?? {}
        this.#type = obj.type
        this.#tree = this.#render()
    }

    id() {
        return this.#id
    }

    tree(state) {
        if(state) {
            this.#properties = this.#props(state)
            this.#tree = this.#render()
        }
        return this.#tree
    }

    hasState(key) {
        if(this.#variables.indexOf(key) >= 0) return true
        return false
    }

    #props(state) {
        let properties = {}
        this.#propertyMap.forEach((v) => {
            properties = {
                ...properties,
                ...this.#iterate(v, state)
            }
        })
        return properties
    }

    #iterate(v, state) {
        const type = v.type
        const key = v.key
        const val = v.value
        this.#variables.push(key)
        let obj = {}
        if(type === "child") {
            obj[key] = this.#iterate(val, state)
        } else if(type === "constant") {
            obj[key] = val
        } else if(type === "variable") {
            obj[key] = state.lookup(val)
        } else if(type === "replace") {
            const array = val
            let str = ""
            array.forEach((t) => {
                if(t.type === "constant") {
                    str += t.value
                } else if(t.type === "variable") {
                    str += state.lookup(t.value)
                }
            })
            obj[key] = str
        }
        return obj
    }

    #render() {
        return h(this.#selector(), this.#properties)
    }

    #selector() {
        let s = this.#type
        if(this.#classes.length > 0) {
            this.#classes.forEach((v) => {
                s += "." + v
            })
        }
        s += this.#id
        return s
    }

}