package com.leo.builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();

        Meal vegMeal = builder.buildVegBurger();
        vegMeal.show();

        Meal chickenMeal = builder.buildChickenBurger();
        chickenMeal.show();
    }
}
