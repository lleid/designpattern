package com.leo.factory;

import com.leo.factory.pizza.ChicagoStyleCheesePizza;
import com.leo.factory.pizza.ChicagoStyleClamPizza;
import com.leo.factory.pizza.ChicagoStyleVeggiePizza;
import com.leo.factory.pizza.Pizza;

/**
 * 芝加哥 披萨 工厂实现类
 */
public class ChicagoPizzaStore extends PizzaStore {

    public ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory;

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza(chicagoPizzaIngredientFactory);
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza(chicagoPizzaIngredientFactory);
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza(chicagoPizzaIngredientFactory);
        } else {
            System.out.println("sorry no " + type + " pizza ");
        }
        return pizza;
    }
}
