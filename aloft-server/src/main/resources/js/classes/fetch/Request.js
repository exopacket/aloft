import axios from "axios";
import ApiResult from "./Response.js";
import Config from "../Config.js"

axios.defaults.baseURL = Config.getApiBase()

export class Request {

    parameters = []
    path = "";

    constructor (path, ...parameters) {
        parameters.forEach((item) => {
            this.push(item[0], item[1])
        })
        this.path = path
        return this
    }

    push(key, value, type = ParameterType.STRING) {
        for(let i=0; i<this.parameters.length; i++) {
            let param = this.parameters[i]
            if(param.key === key) {
                param.value = value
                return this;
            }
        }
        this.parameters.push(new Parameter(key, value, type))
        return this;
    }

    encodeGetParams(p) {
        return Object.entries(p).map(kv => kv.map(encodeURIComponent).join("=")).join("&").toString();
    }

    save() {
        return this; //FIXME clear errors and so forth
    }

    json() {
        return JSON.stringify(this); //for use with return object
    }

    data() {
        let params = {};
        for(let i=0; i<this.parameters.length; i++) {
            params[this.parameters[i].key] = this.parameters[i].value;
        }
        return params;
    }

    async post(formData = null) {
        let resp = {}
        let data = formData ?? this.data();
        try {
            resp = formData !== null ? await axios.postForm("/api" + this.path, data) : await axios.post("/api" + this.path, data);
            let obj = new ApiResult(resp)
            return obj;
        } catch (e) {
            let obj = ApiResult.exception(e.response.data, e.response.status, e.response.headers)
            return obj;
        }
    }

    async postAsync(loaderText = null, loaderCallback = null, formData = null) {
        let resp = {}
        let data = formData ?? this.data();
        try {
            if(loaderCallback) {
                let loader = {
                    style: 1,
                    message: loaderText
                }
                loaderCallback(loader)
            }
            resp = formData !== null ? await axios.postForm("/api" + this.path, data) : await axios.post("/api" + this.path, data);
            let obj = new ApiResult(resp)
            return obj;
        } catch (e) {
            let obj = ApiResult.exception(e.response.data, e.response.status, e.response.headers, loaderCallback)
            return obj;
        }
    }

    async get() {
        let resp = {}
        try {
            let data = this.data();
            let url = "/api" + this.path + "?" + this.encodeGetParams(data);
            resp = await axios.get(url);
        } catch (e) {
            resp = e.response ?? false
        }
        let obj = new ApiResult(resp)
        return obj;
    }

    async getAsync(loaderText = null, loaderCallback = null) {
        let resp = {}
        try {
            if(loaderCallback) {
                let loader = {
                    style: 1,
                    message: loaderText
                }
                loaderCallback(loader)
            }
            let data = this.data();
            let url = "/api" + this.path + "?" + this.encodeGetParams(data);
            resp = await axios.get(url);
        } catch (e) {
            resp = e.response ?? false
        }
        let obj = new ApiResult(resp, loaderCallback)
        return obj;
    }

}

export class Parameter {

    key = "";
    value = "";
    type = "";

    constructor(key, value, type = ParameterType.STRING) {
        this.key = key
        this.value = value
        this.type = type
    }

}

export const ParameterType = {
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