package com.leo.prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        Circle circle = new Circle() {{
            setId("1");
        }};

        ShapeCache.addShape(circle);
        Circle circle1 = (Circle) ShapeCache.getShape("1");
        System.out.println(circle == circle1);

        circle1.setType("123");
        System.out.println(circle.getType());

        circle.setType("456");
        System.out.println(circle1.getType());
    }
}
