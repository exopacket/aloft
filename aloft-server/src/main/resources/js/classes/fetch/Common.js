import {Request} from "./Request.js";
import {Buffer} from "../../node_modules/buffer/index.js"

export default class Common {

    paths = []

    static async loadApplicationInfo()  {
        const bytes = new Uint8Array(32)
        crypto.getRandomValues(bytes)
        const hex = Buffer.from(bytes).toString('hex')
        Common.setCookie("client_id", hex)
        let req = new Request(null,"/")
        req.header("appInfo")
        req.header("X-Aloft-Client-Id", hex)
        const resp = await req.get()
        return resp.body().data
    }

    static setCookie(name, value, expiration = 365) {
        const d = new Date();
        d.setTime(d.getTime() + (expiration * 24 * 60 * 60 * 1000))
        document.cookie = name + "=" + value + ";" + " expires=" + d.toUTCString() + "; path=/";
    }

    static getCookie(name) {
        const cookies = decodeURIComponent(document.cookie).split(";") ?? []
        let v = null
        cookies.forEach((cookie) => {
            if(v) return
            let c = cookie
            while(c.charAt(0) === ' ') c = c.substring(1)
            if(c.indexOf(name + "=") === 0) v = c.substring(name.length + 1)
        })
        return v
    }

}