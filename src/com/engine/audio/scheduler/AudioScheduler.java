package com.engine.audio.scheduler;

import java.io.File;

import com.engine.instance.AudioInstance;
import com.engine.util.datastruct.queue.Queue;

public final class AudioScheduler extends Thread
{
    private Queue<AudioInstance> audioEvents;

    AudioScheduler()
    {
        init(null);
    }

    private void init(File audioConfig)
    {
        
    }

    public synchronized void update()
    {
        
    }

}