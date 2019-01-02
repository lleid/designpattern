package com.leo.factory.pizza;

import com.leo.factory.ingredient.Cheese;
import com.leo.factory.ingredient.Clams;
import com.leo.factory.ingredient.Dough;
import com.leo.factory.ingredient.Sauce;

/**
 * 披萨的基类
 */
public abstract class Pizza {

    public Dough dough;
    public Cheese cheese;
    public Sauce sauce;
    public Clams clams;

    public abstract void prepare();
}
