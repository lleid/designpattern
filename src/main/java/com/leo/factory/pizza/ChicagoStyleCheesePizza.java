package com.leo.factory.pizza;

import com.leo.factory.ChicagoPizzaIngredientFactory;

/**
 * 纽约 芝士 披萨
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory;

    public ChicagoStyleCheesePizza(ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory) {
        this.chicagoPizzaIngredientFactory = chicagoPizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        this.dough = chicagoPizzaIngredientFactory.createDough();
        this.cheese = chicagoPizzaIngredientFactory.createCheese();
        this.sauce = chicagoPizzaIngredientFactory.createSauce();
    }
}
