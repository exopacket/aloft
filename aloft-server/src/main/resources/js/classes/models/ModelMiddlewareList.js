class ModelMiddlewareList {

    #middleware = []

    register(name, middleware) {
        this.#middleware.push({key: name, value: middleware})
    }

    get(name) {
        for(let i=0; i<this.#middleware.length; i++) {
            const entry = this.#middleware[i]
            if(entry.key === name) return entry.value;
        }
        return false
    }

}