package com.guillem.model;

/**
 * Created by guillem on 25/01/2019.
 */
public class Result {

    private String id;
    private String name;

    public Result(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
