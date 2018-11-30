package com.leo.builder;

public class MealBuilder {

    public Meal buildVegBurger() {
        Meal meal = new Meal();
        meal.add(new VegBurger());
        meal.add(new Coke());
        return meal;
    }

    public Meal buildChickenBurger() {
        Meal meal = new Meal();
        meal.add(new ChickenBurger());
        meal.add(new Pepsi());
        return meal;
    }
}
