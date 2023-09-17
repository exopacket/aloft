import State from "js/classes/State.js"

export default class Component {

    state
    id

    constructor(id, state) {
        this.id = id
        this.state = state
    }

}