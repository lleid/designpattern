package com.leo.decorate;

/**
 * 摩卡
 * 具体装饰者
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public Double getCost() {
        return beverage.getCost() + 0.20;
    }
}
