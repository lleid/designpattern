package com.leo.adapter;

public class Mp4Player implements AdvanceMediaPlayer {
    public void play(String fileName) {
        System.out.println("mp4 player :" + fileName);
    }
}
