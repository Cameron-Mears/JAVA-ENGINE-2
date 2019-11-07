package com.engine.util.math;

import java.util.ArrayList;

import com.engine.instance.Instance;
import com.engine.physics.Point2;
import com.engine.util.datastruct.Pair;
import java.util.Comparator;

public final class GMath
{
    public static final int FACTORIAL_MAX = 20;
    public static long[] factorial;
    static
    {
        factorial = new long[FACTORIAL_MAX + 1];
        for (int index = 1; index < FACTORIAL_MAX + 1; index ++)
        {
            factorial[index] = factorial(index);
        }
    }
    private static long factorial(int num)
    {
        long product = num;
        for (int mul = num - 1; mul > 1; mul--)
        {
            product *= mul;
        }
        return product;
    }
    
    public static long sum(int num)
    {
    	return ((num*num)+num)/2;
    }
    
    public static double sumTerms(int numTerms, MathFunction func)
    {
    	return func.function(0);
    }

    public static Point2 rotate(Point2 point, double radians) //returns a new Point2 that is the rotated point
    {
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double x, y;

        x = (point.x * cos)  - (point.y * sin);
        y = (point.x * sin) + (point.y * cos);

        return new Point2(x, y);
    }
    
    public static Point2[] rotatePoints(Point2[] points, double radians) //returns a new Point2 that is the rotated point
    {
        Point2[] rotated = new Point2[points.length];
        
        for (int index = 0; index < points.length; index++) 
        {
			rotated[index] = rotate(points[index], radians);
			
		}
        
        return rotated;
    }

    public static double clamp(double val, double min, double max)
    {
        if (val < min) return min;
        if (val > max) return max;
        return val;
    }
    
    public static float clamp(float val, float min, float max) 
    {
        if (val < min)
            return min;
        if (val > max)
            return max;
        return val;
    }

    public static int clamp(int val, int min, int max) 
    {
        if (val < min)
            return min;
        if (val > max)
            return max;
        return val;
    }

    public static long clamp (long val, long min, long max)
    {
        if (val < min)
            return min;
        if (val > max)
            return max;
        return val;
    }
    
    
    public static void sort(Object[] objects, Comparator<Object> comparer)
    {
    	
    }
    
    public ArrayList<Pair<Instance, Double>> sortByDistance(ArrayList<Instance> instances, Instance target)
    {
    	ArrayList<Pair<Instance,Double>> solved = new ArrayList<Pair<Instance,Double>>(instances.size());
    	for (Instance instance : instances) 
    	{

		}
    	
    }
    
    public class DoubleCompare implements Comparator<Double>
    {

		@Override
		public int compare(Double o1, Double o2) {
			return (o1 > o2)? 1:0;
		}

    }

		
    	
    }
}