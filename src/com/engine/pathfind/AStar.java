package com.engine.pathfind;

import java.util.ArrayList;
import java.util.Stack;

import com.engine.instance.Instance;
import com.engine.physics.CollisionMask;
import com.engine.physics.Vector2;
import com.engine.util.datastruct.list.List;

public class AStar 
{
	ArrayList<CollisionMask> avoid;
	ArrayList<ArrayList<AStarNode>> nodes;
	private static int NodeWidth;
	private static int NodeHeight;
	private static CollisionMask nodeCollider;
	
	static
	{
		NodeWidth = 32;
		NodeWidth = 32;
		
	}
	
	
	
	
	
	private class AStarNode
	{
		public int aCost, bCost, cCost, x, y;
		private ArrayList<AStarNode> closet;
		public void update(int aCost, int bCost)
		{
			
		}
		
		public void expand(ArrayList<ArrayList<AStarNode>> nodes, ArrayList<CollisionMask> avoid)
		{
			avoid.clear();
			
			for (int neighbourX = -1; neighbourX < 1; neighbourX ++) 
			{
				for (int neighbourY = -1; neighbourY < 1; neighbourY ++) 
				{
					
				}
			}
			
		}
		
		public AStarNode resloveNext()
		{
			return null;
		}
	}
}
