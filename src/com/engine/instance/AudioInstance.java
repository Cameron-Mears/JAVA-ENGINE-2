package com.engine.instance;

import javax.sound.sampled.Clip;

public class AudioInstance
{
    private boolean isPlaying;
    private Clip sound;

    public boolean isPlaying()
    {
        return isPlaying;
    }
    
    public void play()
    {
        sound.start();
        isPlaying = true;
    }
}