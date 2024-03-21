class SchemaList {

    #schemas = []

    add(name, schema) {
        let model = new Model(name, schema)
        const obj = {
            name: name,
            schema: model,
            middleware: this.#parseMiddleware(schema)
        }
        this.#schemas.push(obj)
    }

    get(name) {
        for(let i=0; i<this.#schemas.length; i++) {
            if(this.#schemas[i].name === name) return this.#schemas[i]
        }
    }

    middlewareList(name, ...fields) {
        let obj = this.get(name)
        let applicable = []
        for(let i=0; i<fields.length; i++) {
            const all = obj.middleware
            const field = fields[i];
            for(let x=0; x<all.length; x++) {
                const curr = all[x]
                if(curr.field === field) {
                    curr.applicable.forEach((name) => {
                        if(!applicable.includes(name)) { applicable.push(name) }
                    })
                }
            }
        }
        return applicable
    }

    #parseMiddleware(schema) {

    }

}