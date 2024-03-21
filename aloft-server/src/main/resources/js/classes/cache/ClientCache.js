import ApplicationInfo from "./ApplicationInfo.js";
import sha256 from "../../node_modules/crypto-js/sha256"
import Base64 from "../../node_modules/crypto-js/enc-base64"
import Page from "../state/Page";

class ls {
    static get(key) {
        return localStorage.getItem(key)
    }
    static set(key, value) {
        localStorage.setItem(key, value)
    }
    static remove(key) {
        localStorage.removeItem(key)
    }
}

export default class ClientCache {

    appInfo = null
    #appInfoKey
    pageStructure = null
    #pageStructureKey
    componentStructure = null
    #componentStructureKey
    componentState = null
    #componentStateKey

    constructor(hostname) {

        this.#appInfoKey = this.#buildKey(hostname, "APPLICATION_INFO")
        this.#pageStructureKey = this.#buildKey(hostname, "PAGE_STRUCTURE_STORE")
        this.#componentStructureKey = this.#buildKey(hostname, "COMPONENT_STRUCTURE_STORE")
        this.#componentStateKey = this.#buildKey(hostname, "COMPONENT_STATE_STORE")

        this.refresh()

    }

    async refresh() {
        const appInfo = ls.get(this.#appInfoKey)
        console.log(appInfo)
        const pageStructure = ls.get(this.#pageStructureKey)
        const componentStructure = ls.get(this.#componentStructureKey)
        const componentState = ls.get(this.#componentStateKey)

        let validated = false;
        if(appInfo)
            validated = await this.validateApplicationInfo(appInfo)
        if(!appInfo || !validated) {
            ls.remove(this.#pageStructureKey)
            ls.remove(this.#componentStructureKey)
            ls.remove(this.#componentStateKey)
            return
        }

        if(pageStructure) this.pageStructure = this.validatePageStructure(pageStructure)
        if(!this.pageStructure) ls.remove(this.#pageStructureKey)
        if(componentStructure) this.componentStructure = this.validateComponentStructure(componentStructure)
        if(!this.componentStructure) ls.remove(this.#componentStructureKey)
        if(componentState) this.componentState = this.validateComponentState(componentState)
        if(!this.componentState) ls.remove(this.#componentStateKey)
    }

    emptyDatasets() {
        return {
            appInfo : (this.appInfo == null),
            pageStructure : (this.pageStructure == null),
            componentStructure : (this.componentStructure == null),
            componentState : (this.componentState = null)
        }
    }

    isDebug() {
        if(!this.appInfo) return false
        return this.appInfo.isDebug()
    }

    async validateApplicationInfo(jsonStr) {
        let obj = JSON.parse(jsonStr)
        const now = Date.now()
        if(obj.application?.client_updated) {
            obj = obj.application
            const stamp = parseInt(obj.client_updated) + 1080000
            console.log(now)
            console.log(stamp)
            if (now > stamp) {
                console.log("GREATER THAN 3 HOURS?")
                const returnedJsonStr = await builtin.loadApplicationInfo()
                let returned = null
                if (returnedJsonStr) returned = JSON.parse(returned)
                if (returned) {
                    const version = returned.application.version
                    if (version === obj.version) {
                        obj.client_updated = now
                        this.setAppInfo(JSON.stringify({application: obj }), false)
                    } else {
                        returned['client_updated'] = now
                        this.setAppInfo(JSON.stringify({ application: returned }))
                    }
                    return true;
                }
                return false
            } else { this.setAppInfo(JSON.stringify({ application: obj }), false); return true; }
        } else {
            if(obj.application) {
                let dataForCreate = obj.application
                dataForCreate['client_updated'] = now
                this.setAppInfo(JSON.stringify({ application: dataForCreate }))
                return true;
            }
        }
        return false;
    }

    validatePageStructure(jsonStr) {
        const json = JSON.parse(jsonStr)
        if(!json) return this.pageStructure
        const structure = json.pages
        if(!structure) return this.pageStructure
        let obj = this.pageStructure ?? {}
        Object.keys(structure).forEach((key) => {
            if(!this.pageStructure) {
                obj[key] = new Page(structure[key])
            } else {
                const v = structure[key]
                const stored = this.pageStructure[key]
                if(!stored) {
                   obj[key] = new Page(v)
                }
            }
        })
        return (Object.keys(obj) > 0) ? obj : null;
    }

    validateComponentStructure(jsonStr) {
        return null;
    }

    validateComponentState(jsonStr) {
        return null;
    }

    setAppInfo(jsonStr, refresh = true) {
        ls.set(this.#appInfoKey, jsonStr)
        this.appInfo = new ApplicationInfo(jsonStr)
        if(refresh) this.refresh()
    }

    setPageStructure(jsonStr) {
        const obj = (append) ? JSON.parse(jsonStr) :
        ls.set(this.#pageStructureKey, jsonStr)
        this.refresh()
    }

    setComponentStructure(jsonStr, append = false) {
        ls.set(this.#componentStructureKey, jsonStr)
        this.refresh()
    }

    setComponentState(jsonStr, append = false) {
        ls.set(this.#componentStateKey, jsonStr)
        this.refresh()
    }

    #buildKey(hostname, key, ...extras) {
        let raw = hostname + "_" + key
        extras.forEach((v) => { raw += "_" + v })
        return sha256(raw).toString(Base64)
    }

}