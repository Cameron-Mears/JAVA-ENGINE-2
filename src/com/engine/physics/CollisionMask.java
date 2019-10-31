package com.engine.physics;

import com.engine.graphics.Sprite;

public class CollisionMask
{
    public static final int COLLISION_MASK_RECTANGLE = 1;
    public static final int COLLISION_MASK_RECTANGLE_ARR = 2;
    public static final int COLLISION_MASK_CIRCLE = 3;
    public static final int COLLISION_MASK_CIRCLE_ARR = 4;
    
    private Vector2 posiotion;
    private boolean follow;
    
    public CollisionMask(Sprite sprite)
    {
        
    }
    
    public void setPosition(Vector2 pos)
    {
    	posiotion = pos;
    }

    public boolean intersects(CollisionMask other)
    {
    	return false;
    }


    
    public void scale(double factor) {};


}