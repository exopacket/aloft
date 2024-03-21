class CachedInstances {

    #cache = []

    create(model, data) {
        let v = model.clone(data)
        this.#cache.push({id: v.id(), name: v.name(), value: v})
        return v;
    }

    get(id, name) {
        for(let i=0; i<this.#cache.length; i++) {
            let v = this.#cache[i];
            if(v.name === name && v.id === id) return v.value
        }
        return false;
    }

}