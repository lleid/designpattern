package com.leo.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        SingleObject6 singleObject6 = SingleObject6.INSTANCE;
        singleObject6.whateverMethod();

        System.out.println(singleObject6.add("123"));
    }
}
