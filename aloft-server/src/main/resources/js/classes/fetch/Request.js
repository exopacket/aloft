import Response from "./Response.js";
import axios from "../../node_modules/axios/index.js"
import VarManager from "../Vars";

export class Request {

    headers = []
    parameters = []
    requestBody = null
    formData = null
    path = "/";
    validator = {}

    constructor(endpoint, path, params = [], headers = [], body = null) {
        if(!endpoint) this.path = path
        else this.path = vars.endpoints()[endpoint] + path
        this.headers = headers
        if(body) body(body)
        params.forEach((param) => {
            if(param.length === 2) {
                this.param(param[0], param[1])
            }
        })
    }

    #getHeaders(headers = []) {
        console.log(headers)
        if(headers.length === 0) return null
        let obj = {}
        headers.forEach((header) => {
            obj[header[0]] = header[1]
        })
        return Object.keys(obj).length > 0 ? obj : null
    }

    getConfig() {
        let obj = {}
        let headers = []
        for(let i=0; i<this.headers.length; i++) {
            const v = this.headers[i]
            if(v instanceof String || typeof(v) == "string") {
                const h = VarManager.getDefaultHeader(v)
                h.forEach((p) => {
                    headers.push(p)
                })
            } else if(v instanceof Array && v.length === 2) {
                headers.push(v)
            }
        }
        const all = this.#getHeaders(headers)
        if(all) obj['headers'] = all
        console.log(obj)
        return obj
    }

    param(key, value) {
        for(let i=0; i<this.parameters.length; i++) {
            let param = this.parameters[i]
            if(param.key === key) {
                param.value = value
                return this;
            }
        }
        this.parameters.push(new Parameter(key, value, ValueType.STRING))
        return this;
    }

    validation(key, type) {
        this.validator[key] = type
    }

    header(key, value = null) {
        if(!value) this.headers.push(key)
        else this.headers.push([key, value])
    }

    body(body) {
        this.requestBody = null
        if(body instanceof FormData) this.formData = body
        else if(body instanceof String) {
            if(validJson(body)) this.requestBody = JSON.parse(body)
            else this.requestBody = body
        } else if (body instanceof Object || body instanceof Array) {
            this.requestBody = JSON.parse(JSON.stringify(body))
        }
    }

    put(key, value) {
        this.requestBody = null
        if(!this.formData) this.formData = new FormData()
        this.formData.push(key, value)
    }

    encodeUrlParams() {
        if(this.parameters.length === 0) return ""
        let params = {};
        for(let i=0; i<this.parameters.length; i++) {
            params[this.parameters[i].key] = this.parameters[i].value;
        }
        return "?" + Object.entries(params).map(kv => kv.map(encodeURIComponent).join("=")).join("&").toString();
    }

    isForm() {
        return this.requestBody == null && this.formData != null
    }

    async post() {
        const body = this.isForm() ? this.formData : (this.requestBody) ? this.requestBody : "{}"
        try {
            const resp = this.isForm() ? await axios.postForm("/api" + this.path + this.encodeUrlParams(), body, this.getConfig()) : await axios.post("/api" + this.path + this.encodeUrlParams(), body, this.getConfig());
            return new Response(resp)
        } catch (e) {
            return Response.exception(e.response.data, e.response.status, e.response.headers)
        }
    }

    async get() {
        let uri = this.path + this.encodeUrlParams()
        try {
            const resp = await axios.get(uri, this.getConfig());
            return new Response(resp)
        } catch (e) {
            console.log(e.toString())
            if(!e.response) return Response.uncaught(uri, "GET", e)
            return Response.exception(e.response.data, e.response.status, e.response.headers)
        }
    }

}

export class Parameter {

    key = "";
    value = "";
    type = "";

    constructor(key, value, type = ValueType.STRING) {
        this.key = key
        this.value = value
        this.type = type
    }

}

export const ValueType = {
    STRING: 0,
    BOOLEAN: 1,
    DECIMAL: 2,
    INTEGER: 3,
    JSON: 4,
    ARRAY: 5,
    OBJECT: 6,
    UNIX_TIME_MS: 7,
    FILE: 8,

    //CUSTOM VALIDATION TYPES
    EMAIL: 9,
    PHONE: 10,
    PASSWORD: 11,
    DATE: 12,
    DATE_TIME: 13,
    UUID: 14,
    BASE64: 15,
    HEXADECIMAL: 16
}