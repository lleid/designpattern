package com.leo.factory;

import com.leo.factory.ingredient.Cheese;
import com.leo.factory.ingredient.Clams;
import com.leo.factory.ingredient.Dough;
import com.leo.factory.ingredient.Sauce;

/**
 * 配料工厂 抽象工厂模式  生成一组对象
 */
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Clams createClams();
}
