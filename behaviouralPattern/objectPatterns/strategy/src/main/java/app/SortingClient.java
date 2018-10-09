package app;

import strategy.QuickSort;
import strategy.BubbleSort;

public class SortingClient{
	
	public static void main(String[] args){
		double[] list = {1,2,4,7,9,3,2,1.2,7.9,0.2};	
		
		SortingContext contextQuick = new SortingContext();
		contextQuick.setSorter(new QuickSort());
		contextQuick.sortDouble(list);

		SortingContext contextBubble = new SortingContext();
		contextBubble.setSorter(new BubbleSort());
		contextBubble.sortDouble(list);
	
	}
}
