export default class VarManager {

    #loaded = false

    constructor() {

    }

    create(cache) {
        if(this.#loaded) return
        const appInfo = cache.appInfo
        const paths = appInfo.endpoints()

        if (paths.api) this.endpoints.api = paths.api
        if (paths.public) this.endpoints.public = paths.public
        if (paths.state) this.endpoints.state = paths.state
        if (paths.javascript) this.endpoints.javascript = paths.javascript
        if (paths.stylesheets) this.endpoints.stylesheets = paths.stylesheets
        if (paths.images) this.endpoints.stylesheets = paths.stylesheets
        if (paths.files) this.endpoints.files = paths.files

        this.#loaded = true
    }

    get(key) {
        return {}
    }

    static getDefaultHeader(...keys) {
        let arr = []

        keys.forEach((key) => {
            switch (key) {
                case "appInfo":
                    arr.push(["X-Aloft-Protocol-Method", "Application-Info"])
                    break;
            }
        })
        console.log(JSON.stringify(arr))
        return arr
    }

    endpoints() {
        return this.#endpoints
    }

    #endpoints = {
        api: "/",
        public: "/",
        state: "/",
        javascript: "/",
        stylesheets: "/",
        images: "/",
        files: "/"
    }
}