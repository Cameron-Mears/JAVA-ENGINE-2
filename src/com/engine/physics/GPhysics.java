package com.engine.physics;

import com.engine.core.Time;
import com.engine.util.math.GMath;

public final class GPhysics
{
    public static void vectorMagninatudeDriection(Vector2 vector)
    {
        vector.magnitude = Math.hypot(vector.x, vector.y);
        vector.direction = Math.toDegrees(Math.atan(vector.y/vector.x));
    }
    public static void vectorUpdate(Vector2 vector, Vector2 vectorDerivative)
    {
        vector.x += Time.delta * vectorDerivative.x;
        vector.y += Time.delta * vectorDerivative.y;
        vectorMagninatudeDriection(vector);
    }

    public static void vectorUpdate(Vector2 vector, Vector2 ... vectorDerivative) 
    {   
        for (Vector2 vector2 : vectorDerivative) 
        {
            vectorUpdate(vector, vector2);
        }
        vectorMagninatudeDriection(vector);
    }
    public static void updatePosition(Point2 position, Vector2 velocity) 
    {
        long delta = Time.delta;
        position.x += velocity.x * delta;
        position.y += velocity.y * delta;
    }

  
    public static void vectorRotate(Vector2 vector, double rotation)
    {
        double cos = Math.cos(Math.toRadians(rotation));
        double sin = Math.sin(Math.toRadians(rotation));
        double x = vector.x;
        double y = vector.y;
        vector.x = x*cos - y*sin;
        vector.y = x*sin * y*cos;
        vectorMagninatudeDriection(vector);
    }

    public static void rotate(PhysicsBody body)
    {
        
    }

}