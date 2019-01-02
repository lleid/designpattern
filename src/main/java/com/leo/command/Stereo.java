package com.leo.command;

public class Stereo {
    public void on() {
        System.out.println("stereo is on ");
    }

    public void off() {
        System.out.println("stereo is off ");
    }

    public void setDVD() {
        System.out.println("stereo set dvd ");
    }

    public void setCD() {
        System.out.println("stereo set cd ");
    }

    public void setRadio() {
        System.out.println("stereo set radio ");
    }

    public void setVolume(int volume) {
        System.out.println("stereo set volume " + volume);
    }
}
