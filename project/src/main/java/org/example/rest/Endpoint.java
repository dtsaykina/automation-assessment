package org.example.rest;

public enum Endpoint {
    BASKET(""),
    CUSTOMER("");


    public String sourcePath;

    Endpoint(String sourcePath) {
        this.sourcePath = sourcePath;
    }
    public String getValue() {
        return this.sourcePath;
    }
}
