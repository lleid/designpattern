package com.leo.prototype;

/**
 * 方形
 */
public class Square extends Shape {

    public Square() {
        this.type = "square";
    }

    public void draw() {
        System.out.println("inside square:draw() method");
    }
}
