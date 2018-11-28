package com.leo.factory;


public class FactoryPatternDemo {
    public static void main(String[] args) {
        MouseFactory factory = new HpMouseFactory();
        factory.buildMouse().build();

        MouseFactory factory2 = new AcerMouseFactory();
        factory2.buildMouse().build();
    }
}
