package com.leo.factory.pizza;

import com.leo.factory.NYPizzaIngredientFactory;

/**
 * 纽约 蔬菜 披萨
 */
public class NYStyleVeggiePizza extends Pizza {

    public NYPizzaIngredientFactory nyPizzaIngredientFactory;

    public NYStyleVeggiePizza(NYPizzaIngredientFactory nyPizzaIngredientFactory) {
        this.nyPizzaIngredientFactory = nyPizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        this.dough = nyPizzaIngredientFactory.createDough();
        this.cheese = nyPizzaIngredientFactory.createCheese();
        this.sauce = nyPizzaIngredientFactory.createSauce();
    }
}
