package com.engine.pathfind;

import java.util.ArrayList;
import java.util.Map;

import com.engine.instance.Instance;
import com.engine.physics.CollisionMask;
import com.engine.physics.Point2;
import com.engine.physics.Vector2;
import com.engine.util.datastruct.list.List;

public class AStar
{
	ArrayList<CollisionMask> unavaiable;
	ArrayList<ArrayList<AStarNode>> nodesOpen;
	ArrayList<ArrayList<AStarNode>> nodesClosed;
	ArrayList<AStarNode> lowestCost;
	
	private static int NodeWidth;
	private static int NodeHeight;
	private static CollisionMask nodeCollider;
	
	static
	{
		NodeWidth = 32;
		NodeWidth = 32;
		
	}

	public void applyCollisionMasks()
	{
		for (CollisionMask collider : unavaiable) 
		{
			
		}
	}
	
	public ArrayList<AStarNode> findPath(AStarNode start, AStarNode goal, int maxSteps)
	{
		this.applyCollisionMasks();
		return null;
	}
}
