package com.leo.builder;

/**
 * 汉堡包
 */
public abstract class Burger implements Item {
    public Packing packing() {
        return new Wrapper();
    }
}
