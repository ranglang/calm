package com.onectrm.akshare.api.generator;

import java.util.ArrayList;
import java.util.List;

public class AKShareAPIClass {
    private final List<String> importedPackages = new ArrayList<>();
    private final List<com.onectrm.akshare.api.generator.AKShareAPIProperty> properties = new ArrayList<>();
    private com.onectrm.akshare.api.generator.AKShareRawAPI rawAPI;
    private String className;
    private String packageName;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getPackageName() {
        return packageName.replaceAll("macro", "macros");
    }

    public String getRespClasses() {
        return this.className.replaceAll("Request", "Response");
    }

    public String getApiClassName() {
        return this.className.replaceAll("Request", "Api");
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public List<String> getImportedPackages() {
        return importedPackages;
    }

    public List<com.onectrm.akshare.api.generator.AKShareAPIProperty> getProperties() {
        return properties;
    }

    public com.onectrm.akshare.api.generator.AKShareRawAPI getRawAPI() {
        return rawAPI;
    }

    public void setRawAPI(com.onectrm.akshare.api.generator.AKShareRawAPI rawAPI) {
        this.rawAPI = rawAPI;
    }
}
