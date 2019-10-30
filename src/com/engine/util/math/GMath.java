package com.engine.util.math;

import com.engine.graphics.Point;

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

    public static Point rotate(Point point, double radians) //returns a new Point2 that is the rotated point
    {
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double x, y;

        x = (point.x * cos)  - (point.y * sin);
        y = (point.x * sin) + (point.y * cos);

        return new Point(x, y);
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
}