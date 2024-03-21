import VarManager from "./classes/Vars";
let vars = new VarManager()

import ClientCache from "./classes/cache/ClientCache.js";
let cache = new ClientCache(window.location.hostname)
export const appKey = ""//(cache.appInfo?.getAppKey() ?? "_") + "_" + (cache.appInfo?.getClientKey() ?? "_")

import GlobalState from "./classes/state/GlobalState.js";
let state = new GlobalState()

const builtin = require("./classes/fetch/Common.js").default

window.onload = function (){
    wInit(window.location.hostname).then(() => {
        window.air = (cache.isDebug()) ? AloftDebug : Aloft
    })
}

//initialize front end framework after page load (window init)
const wInit = async () => {
    // vars.load(host)
    // builtin.paths = vars.get("paths_object")
    await cInit()
    vars.create(cache)
    // __();
    // page.init()
    // state.init(true, page.window())
}

const cInit = async () => {

    const emptyDatasets = cache.emptyDatasets()
    if(emptyDatasets.appInfo) {
        const json = await builtin.loadApplicationInfo()
        cache.setAppInfo(JSON.stringify(json))
        return
    }

}

//update page components, state, etc
const __ = () => {
    console.log("__() function called")
}

const validJson = (json) => {
    if(!(json instanceof String)) return false
    try { JSON.parse(json) } catch (e) { return false }
    return true
}

class Aloft {
    static __() {
        const res = __();
        if(res) return res;
    }
    // static init() {
    //     const res = wInit(window.location.hostname);
    //     if(res) return res;
    // }
}

class AloftDebug {
    static __() {
        const res = __();
        if (res) return res;
    }

    static init() {
        const res = wInit(window.location.hostname);
        if (res) return res;
    }
}