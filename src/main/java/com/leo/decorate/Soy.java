package com.leo.decorate;

/**
 * 摩卡
 * 具体装饰者
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public Double getCost() {
        return beverage.getCost() + 0.38;
    }
}
