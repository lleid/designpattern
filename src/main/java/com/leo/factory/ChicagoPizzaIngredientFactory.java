package com.leo.factory;

import com.leo.factory.ingredient.Cheese;
import com.leo.factory.ingredient.Clams;
import com.leo.factory.ingredient.Dough;
import com.leo.factory.ingredient.FreshClams;
import com.leo.factory.ingredient.MarinaraSauce;
import com.leo.factory.ingredient.ReggianoCheese;
import com.leo.factory.ingredient.Sauce;
import com.leo.factory.ingredient.ThinCrustDough;

/**
 * 芝加哥 配料工厂 抽象工厂模式  生成一组对象
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Clams createClams() {
        return new FreshClams();
    }
}
