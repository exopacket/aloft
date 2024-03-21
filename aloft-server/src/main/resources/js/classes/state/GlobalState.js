import DataCollections from "../models/DataCollections.js";
import Window from "../view/Window.js";

export default class GlobalState {

    #window
    #data
    #components = []
    #mountableTree = []

    #initialized = false

    init(vars, stored = false, window = null) {
        if(this.#initialized && !stored) return
        if(!this.#window) this.#window = (window) ? window : new Window()
        else if(window) this.#window = window
        if(stored) this.#load()
        else this.#load(true)
        this.#initialized = true
    }

    #load(defaults = false) {
        const res = (defaults) ? false : true
        if(res === false) {
            this.#data = new DataCollections()
        } else {
            this.#data = new DataCollections(res.dataCollections())
        }
    }

    createComponent() {

    }

    cloneComponent() {

    }

    appendMountable() {

    }

    popMountable() {

    }

    replaceMountable() {

    }

    #findComponent(name) {
        return this.#components[0]
    }

}