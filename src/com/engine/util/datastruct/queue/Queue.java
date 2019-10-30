package com.engine.util.datastruct.queue;


import com.engine.util.datastruct.GNode;
import com.engine.util.datastruct.list.List;

public class Queue<ElementType> extends List<ElementType>
{
    public boolean push(GNode<ElementType> node)
    {
        return this.append(node);
    }

    public GNode<ElementType> peek() 
    {
        if (this.head != null) return this.head;
        return null;
    }

    public GNode<ElementType> pop() 
    {
        
        if (this.head != null)
        {
            this.head.free();
            return this.head;
        }
        return null;
    }
}