package com.leo.factory;

import com.leo.factory.ingredient.Cheese;
import com.leo.factory.ingredient.Clams;
import com.leo.factory.ingredient.Dough;
import com.leo.factory.ingredient.FrozenClams;
import com.leo.factory.ingredient.MarinaraSauce;
import com.leo.factory.ingredient.MozzarellaCheese;
import com.leo.factory.ingredient.Sauce;
import com.leo.factory.ingredient.ThickCrustDough;

/**
 * 纽约 配料工厂
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }


    public Clams createClams() {
        return new FrozenClams();
    }
}
