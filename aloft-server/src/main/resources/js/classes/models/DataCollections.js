export default class DataCollections {

    #schemaList = new SchemaList()
    #instances = new CachedInstances()
    //TODO create keystore for hidden values to be stored as ciphertext
    #authenticator = new ResourceAuthenticator()
    #middleware = new ModelMiddlewareList()

    constructor(data = {}) {

    }

    //makes api call to backend with specified fields
    //authenticates with middleware for hidden information
    //BE creates the query and calls the db
    //if resourceId (present in the API call) is already cached
    //on the FE, then the BE will not send schema. Otherwise,
    //if its null: the BE will respond with the full model's schema without the hidden values
    //response will include a JSON object of only the values requested
    //this class will fetch the current instance (unless this create function is called)
    //and fill or replace the values that were present in the response

    //the idea is to minimize API calls, protect hidden resources and their values,
    //plus all relationships with the same db record will be updated across the site
    //There will be a javascript console dump() function that will dump the respected groups and their values
    create(name, ...fields) {

    }

    async update(modelId, instanceId, ...fields) {
        let instance = this.#instances.get(instanceId, modelId)
        let middlewareList = this.#schemaList.middlewareList(modelId, fields)
        let middleware = []
        for(let i=0; i<middlewareList.length; i++) {
            let entry = this.#middleware.get(middlewareList[i])
            if(entry === false) continue;
            middleware.push(entry)
        }
        const auth = this.#authenticator.apply(middleware)
        if(auth === false) return Promise.resolve(instance)
        const request = this.#createUpdateRequest(instance, auth, fields)
        const response = await request.get();
        const json = JSON.parse("" + response.content());
        instance.update(json.data)
        return instance
    }

    registerMiddleware(name, object) {
        this.#middleware.register(name, object)
    }

    #createUpdateRequest(instance, auth, fields) {
        // let req = new Request("resource/" + instance.name())
        // for(let i=0; i<auth.length; i++) {
        //     const obj = auth[i];
        //     req.pushHeader(obj.key, obj.value)
        // }
        // req.pushHeader("schema", instance.schemaHash())
        // req.pushHeader("identifier", instance.id())
        // const includes = JSON.stringify(fields)
        // req.push("includes", includes, ParameterType.ARRAY)
        // return req;
    }

}