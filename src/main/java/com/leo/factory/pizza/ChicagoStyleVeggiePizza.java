package com.leo.factory.pizza;

import com.leo.factory.ChicagoPizzaIngredientFactory;

/**
 * 纽约 蔬菜 披萨
 */
public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory;

    public ChicagoStyleVeggiePizza(ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory) {
        this.chicagoPizzaIngredientFactory = chicagoPizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        this.dough = chicagoPizzaIngredientFactory.createDough();
        this.cheese = chicagoPizzaIngredientFactory.createCheese();
        this.sauce = chicagoPizzaIngredientFactory.createSauce();
    }
}
