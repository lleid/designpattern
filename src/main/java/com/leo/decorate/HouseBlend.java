package com.leo.decorate;

/**
 * house blend 咖啡
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "house blend coffe";
    }

    @Override
    public Double getCost() {
        return 0.89;
    }
}
