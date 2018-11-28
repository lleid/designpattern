package com.leo.factory.abs;


public class AbstractPatternDemo {
    public static void main(String[] args) {
        PcFactory factory = new HpFactory();
        factory.buildMouse().build();
        factory.buildKeybo().build();

        PcFactory factory2 = new AcerFactory();
        factory2.buildMouse().build();
        factory2.buildKeybo().build();
    }
}
