package com.leo.factory;

/**
 * 纽约 蛤蜊 披萨
 */
public class ChicagoStyleClamPizza extends Pizza{
    public ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory;

    public ChicagoStyleClamPizza(ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory) {
        this.chicagoPizzaIngredientFactory = chicagoPizzaIngredientFactory;
    }
    @Override
    public void prepare() {
        this.dough = chicagoPizzaIngredientFactory.createDough();
        this.cheese = chicagoPizzaIngredientFactory.createCheese();
        this.sauce = chicagoPizzaIngredientFactory.createSauce();
    }
}
