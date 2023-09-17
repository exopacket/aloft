export default class State {

    elements = []
    value = {}

    constructor(value = {}) {
        this.value = value
    }

    appendElement(id, state = null) {
        this.elements.push({ id: id, state: state })
    }

}