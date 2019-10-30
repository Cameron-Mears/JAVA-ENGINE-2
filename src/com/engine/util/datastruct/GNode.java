package com.engine.util.datastruct;

import com.engine.util.datastruct.list.List;

public final class GNode<ElementType>
{
    public GNode<ElementType> next;
    public GNode<ElementType> last;
    public ElementType data;
    public List<ElementType> parent;

    public GNode(ElementType data)
    {
        this.data = data;
    }

    public boolean free()
    {
        if (parent.head == this)
        {
            parent.head = this.next;
            if (this.next != null)
            {
                this.next.last = null;
            }
            else
            {
                parent.tail = null;
                return true;
            }
        }
        else if (parent.tail == this)
        {
            parent.tail = this.last;
            this.last.next = null;
            this.last = null;
            return true;
        }
        else
        {
            this.last.next = this.next;
            this.next.last = this.last;
            this.next = this.last = null;
            return true;
        }
        return false;
    }
}