package com.engine.geom;

import com.engine.physics.Point2;
import com.engine.util.math.GMath;

public class Rectangle extends Shape 
{
	private int width, height;
	private Point2[] corners;
	private double scaleFactor;

	@Override
	public boolean intersects(Point2 point) 
	{
		return point.x  > this.position.x && point.x < this.position.x + this.width && point.y > this.position.y && point.y < this.position.y + this.height;
			
	}

	@Override
	public boolean scale(double factor) 
	{
		int widthPrev = this.width;
		int heightPrev = this.height;
		this.height *= factor;
		this.width *= factor;
		this.scaleFactor = factor;
		this.origin.x *= factor;
		this.origin.y *= factor;
		this.position.y += this.height - heightPrev;
		this.position.x += this.width - widthPrev;
		return true;
	}

	@Override
	public boolean rotate(double degrees) 
	{
		
		corners = GMath.rotatePoints(corners, Math.toDegrees(degrees));
		return false;
	}

	
}
