const axios = {}
import _Response from "./_Response.js";

export class _Request {

    headers = []
    parameters = []
    requestBody = null
    formData = null
    path = "/";
    validator = {}

    constructor(path, params = [], headers = [], body = null) {
        this.path = path
        this.headers = headers
        if(body) body(body)
        params.forEach((param) => {
            if(param.length === 2) {
                this.param(param[0], param[1])
            }
        })
    }

    getHeaders(headers = []) {
        if(headers.length === 0) return null
        let obj = {}
        headers.forEach((header) => {
            if(header.length === 2) {
                obj[header[0]] = header[1]
            } else if(header.length === 1 || header instanceof String) {
                if(header.length === 1 && header[0] instanceof String) header = header[0]
                if(header instanceof String) {
                    const defHeader = vars.getDefaultHeader(header)
                    if(defHeader) obj[defHeader[0]] = defHeader[1]
                    else obj[header] = null
                }
            }
        })
        return Object.keys(obj).length > 0 ? obj : null
    }

    getConfig() {
        let obj = {}
        const headers = this.getHeaders(this.headers)
        if(headers) obj['headers'] = headers
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

    header(key, value) {
        this.headers.push([key, value])
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
            return new _Response(resp)
        } catch (e) {
            return _Response.exception(e.response.data, e.response.status, e.response.headers)
        }
    }

    async get() {
        try {
            const resp = await axios.get("/api" + this.path + this.encodeUrlParams(), this.getConfig());
            return new _Response(resp)
        } catch (e) {
            return _Response.exception(e.response.data, e.response.status, e.response.headers)
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