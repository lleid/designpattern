package com.leo.factory;

import com.leo.factory.pizza.NYStyleCheesePizza;
import com.leo.factory.pizza.NYStyleClamPizza;
import com.leo.factory.pizza.NYStyleVeggiePizza;
import com.leo.factory.pizza.Pizza;

/**
 * 纽约 披萨 工厂实现类
 */
public class NYPizzaStore extends PizzaStore {

    public NYPizzaIngredientFactory nyPizzaIngredientFactory;

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza(nyPizzaIngredientFactory);
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza(nyPizzaIngredientFactory);
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza(nyPizzaIngredientFactory);
        } else {
            System.out.println("sorry no " + type + " pizza ");
        }
        return pizza;
    }
}
