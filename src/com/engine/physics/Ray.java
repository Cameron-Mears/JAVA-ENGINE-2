package com.engine.physics;

import com.engine.util.datastruct.list.List;

import com.engine.util.datastruct.GNode;

public class Ray
{
    public static List<PhysicsBody> bodies = new List<PhysicsBody>();

    public static HitInfo rayCast(Ray ray) 
    {
        GNode<PhysicsBody> body = bodies.head;
        return null;
    }

    public static HitInfo rayCast(Ray ray, Class targetClass) 
    {
        GNode<PhysicsBody> body = bodies.head;
        if (body == null) return null;
        while (body.next != null)
        {
            if (body.data.parent.getClass() == targetClass)
            {
                PhysicsBody collisionTest = body.data;

                if (ray.position.x > collisionTest.position.x && ray.position.y > collisionTest.position.y && ray.direction > Vector2.LEFT) {body = body.next; continue;}


            }
            body = body.next;
        }

        return null;
    }

    public double maxLength;
    public double direction;
    public Vector2 position;
    public Ray(double maxLength, double direction, Vector2 osition)
    {

    }

    public class HitInfo
    {
        Vector2 castedLocation;
        public double distance;
        public PhysicsBody hitTarget;
    }
}