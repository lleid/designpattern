package com.leo.decorate;

/**
 * 浓缩咖啡
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "espresso";
    }

    @Override
    public Double getCost() {
        return 1.99;
    }
}
