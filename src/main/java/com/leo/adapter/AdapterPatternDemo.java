package com.leo.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioMediaPlayer player = new AudioMediaPlayer();
        player.play("mp3", "a.mp3");
        player.play("mp4", "b.mp4");
        player.play("vlc", "c.vlc");
        player.play("mp5", "d.mp5");
    }
}
