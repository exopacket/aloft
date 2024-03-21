export default class Response {

    #body = {}

    constructor(data) {

        this.#body = data

        // this.status = obj.status;
        // this.statusText = obj.statusText
        // this.success = obj.data?.success?.is ?? obj.success?.is;
        // this.error = obj.data?.error?.is ?? obj.error?.is;
        // this.errorMessage = obj.data?.error?.message ?? obj.error?.message;
        // this.cookies = obj.cookies;
        // this.headers = obj.headers;
        // this.response = obj.data?.response ?? obj.response;
        // this.path = obj.config?.url;
        // this.redirect = obj.data?.redirect ?? obj.redirect;
        // this.callback = callback;

    }

    body() {
        return this.#body
    }

    static exception(data, status, headers, cookies = {}) {
        let obj = {
            ...data, status, headers, cookies
        }
        return new Response(obj)
    }

    static uncaught(path, type, err) {
        return new Response({
            error: {
                path: path,
                requestType: type,
                exception: JSON.stringify(err)
            }
        })
    }

}
