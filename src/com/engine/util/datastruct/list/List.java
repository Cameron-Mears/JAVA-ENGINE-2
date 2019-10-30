package com.engine.util.datastruct.list;

import com.engine.util.datastruct.GNode;

public class List<ElementType>
{
    public int length;
    public GNode<ElementType> head;
    public GNode<ElementType> tail;

    public boolean append(GNode<ElementType> node) 
    {
        if (tail != null)
        {
            node.last = this.tail;
            this.tail.next = node;
            this.tail = node;
            node.parent = this;
            length ++;
            return true;
        }
        else
        {
            if (head == null) 
            {
                this.head = this.tail = node;
                node.parent = this;
                length++;
                return true;
            }
            return false;
        }
    }

    /*
    public ElementType[] toArray()
    {
        ElementType[] arr = new ElementType[this.length];
        int index = 0;
        if (this.head == null) return arr;
        GNode<ElementType> current = this.head;
        while (start.next != null)
        {
            arr[index] = current;
            index++;
            current = current.next;
        }
        return arr;
    }
    */
}