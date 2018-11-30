package com.leo.bridge;

public class Circle implements Shape {
    private DrawAPI drawAPI;

    public Circle(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public void draw() {
        drawAPI.drawCircle();
    }
}
