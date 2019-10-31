package com.engine.physics;

public class Vector2
{
    public static final int UP = 270;
    public static final int DOWN = 90;
    public static final int LEFT = 180;
    public static final int RIGHT = 0;
    
    
    public Vector2() {};
    public Vector2(double x, double y) {this.x = x; this.y = y;};
    public double x;
    public double y;
    public double magnitude;
    public double direction;

}