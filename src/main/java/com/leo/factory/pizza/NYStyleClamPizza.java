package com.leo.factory.pizza;

import com.leo.factory.NYPizzaIngredientFactory;

/**
 * 纽约 蛤蜊 披萨
 */
public class NYStyleClamPizza extends Pizza {

    public NYPizzaIngredientFactory nyPizzaIngredientFactory;

    public NYStyleClamPizza(NYPizzaIngredientFactory nyPizzaIngredientFactory) {
        this.nyPizzaIngredientFactory = nyPizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        this.dough = nyPizzaIngredientFactory.createDough();
        this.cheese = nyPizzaIngredientFactory.createCheese();
        this.sauce = nyPizzaIngredientFactory.createSauce();
    }
}
