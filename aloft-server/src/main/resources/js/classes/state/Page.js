import bCrypt from "../encryption/bCrypt";

export default class Page {

    #id
    #endpoint
    #structure
    #lock

    constructor(page) {

    }

    setStructure(obj, hash) {
        if(hash === this.#lock) return
    }

}