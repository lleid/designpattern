package com.leo.prototype;

/**
 * 圆形
 */
public class Circle extends Shape {

    public Circle() {
        this.type = "circle";
    }

    public void draw() {
        System.out.println("inside circle:draw() method");
    }
}
