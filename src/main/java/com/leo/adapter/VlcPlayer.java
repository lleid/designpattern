package com.leo.adapter;

public class VlcPlayer implements AdvanceMediaPlayer {
    public void play(String fileName) {
        System.out.println("vlc player :" + fileName);
    }
}
