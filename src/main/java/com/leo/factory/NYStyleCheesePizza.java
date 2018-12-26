package com.leo.factory;

/**
 * 纽约 芝士 披萨
 */
public class NYStyleCheesePizza extends Pizza {

    public NYPizzaIngredientFactory nyPizzaIngredientFactory;

    public NYStyleCheesePizza(NYPizzaIngredientFactory nyPizzaIngredientFactory) {
        this.nyPizzaIngredientFactory = nyPizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        this.dough = nyPizzaIngredientFactory.createDough();
        this.cheese = nyPizzaIngredientFactory.createCheese();
        this.sauce = nyPizzaIngredientFactory.createSauce();
    }
}
