package com.inteliense.aloft.cli.config;

import com.google.gson.JsonArray;
import com.inteliense.aloft.cli.fs.FileSystem;
import com.inteliense.aloft.cli.project.AloftProject;
import com.inteliense.aloft.utils.data.JSON;
import com.inteliense.aloft.utils.encryption.Rand;
import com.inteliense.aloft.utils.global.__;
import com.google.gson.JsonObject;

public class AppConfig {

    private AloftProject project;
    private FileSystem fs;
    private String packageName;

    public AppConfig(FileSystem fs) {
        this.fs = fs;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public void createTemplate(String projectName, String pkg) {
        JsonObject json = new JsonObject();

        JsonObject project = new JsonObject();
        project.addProperty("name", projectName);
        project.addProperty("package", pkg + "." + projectName.replaceAll("[\s-.]", "_"));
        project.addProperty("author", "");
        project.addProperty("description", "");
        project.addProperty("key", __.hex(Rand.secure(32)));
        project.addProperty("version", "1.0.0");
        project.addProperty("build-type", "debug");
        project.addProperty("aloft-version", "1.0.0");

        JsonArray middleware = new JsonArray();
        middleware.add(buildMiddleware("HasHeader", "*", false));
        middleware.add(buildMiddleware("has-api-key", "api/*", false));
        middleware.add(buildMiddleware("SessionExists", false));

        JsonArray modules = new JsonArray();
        modules.add(buildModule("aloft/tailwindcss", "git://path/to/repo", "1.0.0"));
        modules.add(buildModule("aloft/base-components", "git://path/to/repo", "1.0.0"));
        modules.add(buildModule("aloft/crypto", "git://path/to/repo", "1.0.0"));

        JsonObject debugServerPorts = new JsonObject();
        debugServerPorts.addProperty("http", 8181);
        debugServerPorts.addProperty("https", 8182);
        debugServerPorts.addProperty("hot-reload", 3030);

        JsonObject debugServer = new JsonObject();
        debugServer.addProperty("https", false);
        debugServer.addProperty("enable-hot-reload", true);
        debugServer.add("ports", debugServerPorts);
        debugServer.addProperty("bind-all", false);

        JsonObject publicServerPorts = new JsonObject();
        publicServerPorts.addProperty("http", 80);
        publicServerPorts.addProperty("https", 443);

        JsonObject publicServerSSL = new JsonObject();
        publicServerSSL.addProperty("certificate-filepath", "/path/to/ssl/certificate");
        publicServerSSL.addProperty("certificate-key-filepath", "/path/to/ssl/certificate/key");
        publicServerSSL.addProperty("certificate-chain-filepath", "/path/to/ssl/certificate/chain");

        JsonObject publicServer = new JsonObject();
        publicServer.addProperty("public-domain", "mydomain.com");
        publicServer.addProperty("content-root", "/home/aloft/sites/" + projectName);
        publicServer.addProperty("https", true);
        publicServer.add("ssl", publicServerSSL);
        publicServer.add("ports", publicServerPorts);

        JsonObject routeBase = new JsonObject();
        routeBase.addProperty("api", "/ajax");
        routeBase.addProperty("public-api", "/api");
        routeBase.addProperty("update-state", "/state");
        routeBase.addProperty("javascript", "/js");
        routeBase.addProperty("stylesheets", "/css");
        routeBase.addProperty("images", "/image");
        routeBase.addProperty("files", "/attachments");

        JsonObject loadBalancing = new JsonObject();
        JsonObject proxies = new JsonObject();
        JsonObject cloud = new JsonObject();
        cloud.addProperty("provider", "aws");
        cloud.addProperty("secret-key", "SECRET_KEY");

        JsonObject server = new JsonObject();
        server.add("debug", debugServer);
        server.add("public", publicServer);
        server.add("routes", routeBase);
        server.add("load-balancing", loadBalancing);
        server.add("proxies", proxies);
        server.add("cloud", cloud);

        json.add("project", project);
        json.add("modules", modules);
        json.add("middleware", middleware);
        json.add("server", server);
        try {
            fs.printConfig(projectName, JSON.getString(json, true));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void createProjectDirs() {
        fs.createProjectDirs(packageName);
    }

    private JsonObject buildModule(String name, String repo, String version) {
        JsonObject obj = new JsonObject();
        JsonObject mod = new JsonObject();
        mod.addProperty("git", repo);
        mod.addProperty("version", version);
        obj.add(name, mod);
        return obj;
    }

    private JsonObject buildMiddleware(String name, boolean hardFail) {
        JsonObject obj = new JsonObject();
        JsonObject middleware = new JsonObject();
        middleware.addProperty("hard-fail", hardFail);
        middleware.addProperty("route-specific", true);
        obj.add(name, middleware);
        return obj;
    }

    private JsonObject buildMiddleware(String name, String path, boolean hardFail) {
        JsonObject obj = new JsonObject();
        JsonObject middleware = new JsonObject();
        middleware.addProperty("apply", path);
        middleware.addProperty("hard-fail", hardFail);
        middleware.addProperty("route-specific", false);
        obj.add(name, middleware);
        return obj;
    }

}
