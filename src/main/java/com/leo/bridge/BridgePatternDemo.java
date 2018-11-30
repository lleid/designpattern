package com.leo.bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(new RedCircle());
        circle.draw();

        circle = new Circle(new GreenCircle());
        circle.draw();
    }
}
