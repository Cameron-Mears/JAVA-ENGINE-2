package com.engine.physics;

import com.engine.instance.Instance;

public class PhysicsBody
{
    public Vector2 position;
    public Vector2 centerOfMass; //origin (rel to position), if null top left is origin
    public Instance parent;
}