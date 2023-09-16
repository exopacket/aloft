import Config from "./classes/Config.js";

console.log(Config.getApiBase())

new WebSocket("ws://127.0.0.1:3030/debug")