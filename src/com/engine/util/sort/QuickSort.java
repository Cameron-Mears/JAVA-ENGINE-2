package com.engine.util.sort;

public final class QuickSort<ElementType>
{
	public void quickSort(ElementType[] list, int begin, int end, Comparator<ElementType> comparator, boolean reverse) {
	    if (begin < end) {
	        int partitionIndex = partition(list, begin, end, comparator, reverse);
	 
	        quickSort(list, begin, partitionIndex - 1, comparator, reverse);
	        quickSort(list, partitionIndex + 1, end, comparator, reverse);
	    }
	}
	
	
	private int partition(ElementType[] list, int begin, int end, Comparator<ElementType> comparator, boolean reverse) {
	    ElementType pivot = list[end];
	    int i = (begin-1);
	    
	    if (reverse)
	    {
	    	for (int j = begin; j < end; j++) {
		        if (!comparator.compareFunction(list[j], pivot)) 
		        {
		            i++;
		 
		            ElementType swapTemp = list[i];
		            list[i] = list[j];
		            list[j] = swapTemp;
		        }
		    }
	    }
	    else
	    {
	    	for (int j = begin; j < end; j++) {
		        if (comparator.compareFunction(list[j], pivot)) 
		        {
		            i++;
		 
		            ElementType swapTemp = list[i];
		            list[i] = list[j];
		            list[j] = swapTemp;
		        }
		    }
	    }
	 
	    ElementType swapTemp = list[i+1];
	    list[i+1] = list[end];
	    list[end] = swapTemp;
	 
	    return i+1;
	}
}
