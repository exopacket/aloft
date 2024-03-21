class Model {

    #id
    #name
    #schema = {}
    #data = null
    #bindings = []

    constructor(name, schema, data = null) {
        this.#name = name
        this.#schema = schema
        this.#data = data
        if(data) this.id = "adsfhkjashdfjkasdhfkj;" + id
    }

    clone(data) {
        let instance = new Model(this.#name, this.#schema, data)
        if(data.length > 0) {

        }
        return instance
    }

    update(data) {
        //callBindings()
    }

    bind(key, callback) {

    }

    unbind(key) {

    }

    id() {
        return this.#id
    }

    name() {
        return this.#name
    }

    data() {
        return {#name: this.#data}
    }

    schemaHash() {
        return "#########"
    }

    json() {
        return JSON.stringify({#name: this.#data})
    }

}