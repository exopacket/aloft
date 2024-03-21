export default class ComponentState {

    refs = []

    constructor(initial, setState) {
        initial.bind("key", (v) => {
            refs[0] = v
            setState()
        })
    }

    update(data) {

    }

}