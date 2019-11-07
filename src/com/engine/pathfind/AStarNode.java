package com.engine.pathfind;

import java.util.ArrayList;

import com.engine.physics.CollisionMask;

public class AStarNode
{
	public boolean nodeUnavaible;
	public int x, y;
	public double a, b, f;
	public void update(int aCost, int bCost)
	{
		
	}
	
	public AStarNode(double a, double b, int x, int y)
	{
		this.a = a;
		this.b = b;
		this.f = a + b;
		this.x = x;
		this.x = y;
	}
	
	public void expand(AStarNode goal, ArrayList<ArrayList<AStarNode>> nodes)
	{
		
		
		for (int neighbourX = this.x-1; neighbourX < this.x+1; neighbourX ++) 
		{
			for (int neighbourY = this.y-1; neighbourY < this.x+1; neighbourY ++) 
			{
				AStarNode neighbour = nodes.get(neighbourX).get(neighbourY);
				if (neighbour == null)
				{
					neighbour = new AStarNode(this.a + Math.hypot(neighbourX - this.x, neighbourY - this.y), distanceTo(neighbourX, neighbourY, goal), neighbourX, neighbourY);
					
				}
				if (!neighbour.nodeUnavaible)
				{
					
				}
			}
		}
		
	}
	
	public double distanceTo(int x, int y, AStarNode goal)
	{
		return Math.hypot(goal.x - x, goal.y - y);
	}
	
	public AStarNode resloveNext()
	{
		return null;
	}
}