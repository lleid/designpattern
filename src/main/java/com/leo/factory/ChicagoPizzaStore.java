package com.leo.factory;

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
