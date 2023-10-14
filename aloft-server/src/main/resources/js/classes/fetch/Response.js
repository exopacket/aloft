export default class Response {

    status = -1
    statusText = "";
    success = null
    error = null
    errorMessage = "Unknown error occurred"
    cookies = []
    headers = []
    response = {}
    path = ""
    redirect = {}
    callback = null

    constructor(obj, callback) {

        this.status = obj.status;
        this.statusText = obj.statusText
        this.success = obj.data?.success?.is ?? obj.success?.is;
        this.error = obj.data?.error?.is ?? obj.error?.is;
        this.errorMessage = obj.data?.error?.message ?? obj.error?.message;
        this.cookies = obj.cookies;
        this.headers = obj.headers;
        this.response = obj.data?.response ?? obj.response;
        this.path = obj.config?.url;
        this.redirect = obj.data?.redirect ?? obj.redirect;
        this.callback = callback;

    }

    static exception(data, status, headers, cookies, callback = null) {
        let obj = {
            ...data, status, headers, cookies
        }
        return new ApiResult(obj, callback)
    }

    isError() {
        return this.error?.is === true || !(this.status >= 200 && this.status <= 299)
    }

    errorMessage() {
        return this.errorMessage
    }

    handle(callback = null) {

        if(callback === null && this.callback) callback = this.callback

        if(this.redirect?.is) {
            router.visit(this.redirect.href, { method: 'get' })
            return false;
        } else if(this.error?.is) {
            if(callback !== null) {
                callback({
                    type: "error",
                    message: this.errorMessage,
                    problems: [this.errorMessage],
                    style: "danger",
                })
            }
            return false;
        } else if(this.success?.is) {
            if (this.success.message && callback !== null) {
                callback({
                    type: this.data.success.type,
                    message: this.data.success.message,
                    style: "success",
                    opts: this.data.success.opts
                })
            }
            return this.response.content
        } else if(this.response) {
            if(callback !== null) callback({style: "success"});
            return this.response.content
        } else {
            if(!(this.status >= 200 && this.status <= 299)) {
                if(callback !== null) {
                    callback({
                        type: "error",
                        message: "An unknown error occurred.",
                        problems: ["An unknown error occurred."],
                        style: "danger",
                    })
                }
                return this.status;
            } else {
                if(callback !== null) callback({style: "success"});
                return this.response;
            }
        }

    }

    content() {
        if(this.response?.content) {
            return this.response.content
        } else if(this.response) {
            return this.response
        } else { return this.status }
    }

}
