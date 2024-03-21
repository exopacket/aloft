import h from "virtual-dom/h.js";
import Element from "./Element.js";
import {diff, patch} from "virtual-dom";
import ComponentState from "../state/ComponentState.js";

export default class Component {

    #id = null
    #tree = null
    #classes = []
    #type = null
    #container = []
    #children = []
    #properties = []
    #propertyMap = []
    #variables = []
    #state

    constructor(id, obj, state) {
        this.#state = new ComponentState(state, this.setState)
        this.#id = obj.id
        const properties = obj.properties ?? []
        this.#propertyMap = obj.properties ?? []
        this.#properties = this.#props(state)
        this.#classes = obj.classes ?? {}
        this.#type = obj.type
        this.children = obj.children ?? []
        this.#tree = this.#render()
    }

    #init(state, globalState) {

    }

    setState() {
        this.#tree = this.#render()
    }

    get() {
        return this.#tree
    }

    updateState(keys, global) {
        this.#container.forEach((child) => {
            if(child instanceof Component) child.updateState(keys, global)
            else if(child instanceof Element) {
                let update = false
                keys.forEach((key) => {
                    if(child.hasState(key)) {
                        update = true
                    }
                })
                if(update) {
                    let current = this.#children[child.id()]
                    let replace = child.tree(global)
                    let patches = diff(current, replace)
                    this.#children[child.id()] = patch(this.#children[child.id()], patches)
                }
            }
        })
    }

    #fetchState() {
        return null
    }

    variables() {
        return this.#variables
    }

    #props(state) {
        let properties = {}
        (obj.properties ?? []).forEach((v) => {
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

    #render(){
        return h(this.#selector(), this.#properties, Object.values(this.#children))
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