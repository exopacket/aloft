export default class GlobalState {

    elements = []
    values = {}

    constructor() {
        this.value = value
    }

    lookup(key) {
        return this.values[key] ?? null
    }

}