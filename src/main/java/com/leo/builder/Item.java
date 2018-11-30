package com.leo.builder;

/**
 * 食物条目，公共接口
 */
public interface Item {

    public Packing packing();

    public float price();

    public String name();
}
