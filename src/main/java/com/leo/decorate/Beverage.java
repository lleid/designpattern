package com.leo.decorate;

/**
 * 饮料基类， 被装饰器
 */
public abstract class Beverage {
    String description = "unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract Double getCost();
}
