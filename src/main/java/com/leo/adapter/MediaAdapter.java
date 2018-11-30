package com.leo.adapter;

public class MediaAdapter {

    private AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String type) {
        if (type.equals("mp4")) {
            advanceMediaPlayer = new Mp4Player();
        } else if (type.equals("vlc")) {
            advanceMediaPlayer = new VlcPlayer();
        }
    }

    public void play(String fileName) {
        advanceMediaPlayer.play(fileName);
    }
}

