package com.leo.decorate;

/**
 * 深焙 咖啡
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "house blend coffe";
    }

    @Override
    public Double getCost() {
        return 0.89;
    }
}
