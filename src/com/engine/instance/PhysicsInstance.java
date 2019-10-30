package com.engine.instance;

import com.engine.physics.*;

public class PhysicsInstance
{
    public double mass;
    public Point2 position;
    public Vector2 velocity;
    public Vector2 acceleration;
    public PhysicsBody body;
    void update()
    {
        GPhysics.updatePosition(position, velocity);
    }
}