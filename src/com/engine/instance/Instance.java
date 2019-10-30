package com.engine.instance;

import com.engine.util.datastruct.GNode;

public abstract class Instance
{
    private GNode<Instance> instanceEntry;
    private AudioInstance audioInstance;
    private PhysicsInstance physicsInstance;
    private CollosionInstance collosionInstance;
    private GraphicsInstance graphicsInstance;
    private InputInstance inputInstance;

    private boolean physics, collosion, graphics, input, audio, health;

    public Instance(boolean physics, boolean collosion, boolean health, boolean graphics, boolean input, boolean audio)
    {
        this.instanceEntry = new GNode<Instance>(this);
        if (audio) audioInstance = new AudioInstance();
        if (physics) audioInstance = new AudioInstance();
        if (input) audioInstance = new AudioInstance();
        if (health) audioInstance = new AudioInstance();
        if (graphics) audioInstance = new AudioInstance();
        if (collosion) audioInstance = new AudioInstance();
        
        this.physics = physics;
        this.collosion = collosion;
        this.audio = audio;
        this.input = input;
        this.health = health;
        this.graphics = graphics;
    }

    

    public void delete()
    {
        this.instanceEntry.free();
    }

    protected AudioInstance getAudioInstance()
    {
        return audioInstance;
    }


    public abstract void update();

    public abstract void render();

    public abstract void onCreate();

    public abstract void onDestroy();

    protected void healthIsZero(HealthInstance instance) {};
}