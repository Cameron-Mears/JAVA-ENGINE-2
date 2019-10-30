package com.engine.instance;

import com.engine.util.math.GMath;

public class HealthInstance
{
    private int health;
    private int maxHealth;
    private Instance parent;

    public HealthInstance(int health, int maxHealth, Instance parent) 
    {
        this.health = health;
        this.maxHealth = maxHealth;
        this.parent = parent;
    };


    public void decrement()
    {
        health --;
        if (health <= 0) parent.healthIsZero(this);
    }

    public void increment() 
    {
        health ++;
        GMath.clamp(health, 0, maxHealth);
    }

    public void decrease(int amount)
    {
        health -= amount;
        if (health <= 0) parent.healthIsZero(this);
    }

    public void increase(int amount) 
    {
        health += amount;
        GMath.clamp(health, 0, maxHealth);
    }

    public int getHealth()
    {
        return health;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }
}