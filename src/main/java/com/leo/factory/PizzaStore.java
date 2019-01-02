package com.leo.factory;

import com.leo.factory.pizza.Pizza;

/**
 * 披萨的工厂类
 */
public abstract class PizzaStore {
    public abstract Pizza createPizza(String type);
}
