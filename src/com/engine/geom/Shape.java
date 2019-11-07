package com.engine.geom;

import com.engine.physics.Point2;
import com.engine.physics.Vector1;
import com.engine.physics.Vector2;

public abstract class Shape 
{
	protected Vector2 position;
	protected Vector2 origin;
	protected Vector1 rotation;
	protected double scaleFactor;
	
	public abstract boolean intersects(Point2 point);
	public abstract boolean scale(double factor);
	
	public abstract boolean rotate(double degrees);
	
	
	public boolean setPosition(Vector2 position)
	{
		this.position = position;
		return true;
	}
	
	public boolean setOrigin(Vector2 origin)
	{
		this.origin = origin;
		return true;
	}
	
	public double getScale()
	{
		return scaleFactor;
	}
	
	public Vector1 getRotation()
	{
		return this.rotation;
	}
	
	public Vector2 getPostion()
	{
		return this.position;
	}
	
	
	public Vector2 getOirgin()
	{
		return this.position;
	}
}


