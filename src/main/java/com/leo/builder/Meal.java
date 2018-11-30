package com.leo.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 套餐
 */
public class Meal {

    private List<Item> itemList = new ArrayList<Item>();

    public void add(Item item) {
        itemList.add(item);
    }

    public float price() {
        float sub = 0f;
        for (Item item : itemList) {
            sub += item.price();
        }
        return sub;
    }

    public void show() {
        for (Item item : itemList) {
            System.out.println(item.name() + "," + item.packing().pack() + "," + item.price());
        }
    }
}
