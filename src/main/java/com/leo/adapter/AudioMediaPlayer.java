package com.leo.adapter;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class AudioMediaPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    public void play(String autoType, String fileName) {
        if (autoType.equals("mp3")) {
            System.out.println("mp3 player :" + fileName);
        } else if (autoType.equals("mp4")) {
            mediaAdapter = new MediaAdapter("mp4");
            mediaAdapter.play(fileName);
        } else if (autoType.equals("vlc")) {
            mediaAdapter = new MediaAdapter("vlc");
            mediaAdapter.play(fileName);
        } else {
            System.out.println("invild media type " + autoType + " cant supported");
        }
    }
}
