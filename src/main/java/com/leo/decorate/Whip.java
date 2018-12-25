package com.leo.decorate;

/**
 * whip
 * 具体装饰者
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public Double getCost() {
        return beverage.getCost() + 0.59;
    }
}
