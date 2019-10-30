package com.game.entites;

import com.engine.instance.HealthInstance;
import com.engine.instance.Instance;

public class Player extends Instance 
{

    public Player()
    {
        super(false, false, false, false, false, false);
    }

    @Override
    public void update() 
    {
        this.getAudioInstance().isPlaying();
    }

    @Override
    public void render() 
    {
        

    }

    @Override
    public void onCreate()
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void onDestroy() 
    {
        // TODO Auto-generated method stub

    }

    @Override
    protected void healthIsZero(HealthInstance instance)
    {

    }
    
}