package com.leo.prototype;

/**
 * 矩形
 */
public class Rectangle extends Shape {

    public Rectangle() {
        this.type = "circle";
    }

    public void draw() {
        System.out.println("inside circle:draw() method");
    }
}
