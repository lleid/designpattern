package com.leo.builder;

public abstract class Drink implements Item {
    public Packing packing() {
        return new Bottle();
    }
}
