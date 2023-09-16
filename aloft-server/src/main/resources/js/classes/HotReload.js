export default class HotReload {

    sock;

    constructor(port) {
        this.openWebSocket("ws://127.0.0.1:" + port)
    }

    openWebSocket(url) {
        this.sock = new WebSocket(url);
    }

}