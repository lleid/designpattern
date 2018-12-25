package com.leo.bridge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(new RedCircle());
        circle.draw();

        circle = new Circle(new GreenCircle());
        circle.draw();

        List<String> list= Arrays.asList("a","b");
//        list.add("c");
        System.out.println(list);

        List<String> list1= Collections.nCopies(10,"a");
        list1.add("c");
        System.out.println(list1);
    }
}
