package com.leo.singleton;

public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    private static SingleObject getInstance() {
        return instance;
    }
}
