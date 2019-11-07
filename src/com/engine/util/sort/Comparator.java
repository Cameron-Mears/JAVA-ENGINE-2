package com.engine.util.sort;

public abstract interface Comparator<Element>
{
	public abstract boolean compareFunction(Element a, Element b);
}
