package com.leo.command;

public class CeilingFan {

    public final static int HIGH = 3;
    public final static int MEDIUM = 2;
    public final static int LOW = 1;
    public final static int OFF = 0;

    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("ceilingfan is on high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("ceilingfan is on medium");
    }

    public void low() {
        speed = LOW;
        System.out.println("ceilingfan is on low");
    }

    public void off() {
        speed = OFF;
        System.out.println("ceilingfan is off");
    }

    public int getSpeed() {
        return speed;
    }
}
