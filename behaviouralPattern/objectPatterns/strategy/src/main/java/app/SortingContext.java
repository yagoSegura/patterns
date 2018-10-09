package app;

import strategy.SortInterface;

public class SortingContext{
	
	private SortInterface sorter = null;

	public void sortDouble(double[] list){
		sorter.sort(list);
	}

	public SortInterface getSorter(){
		return sorter;
	}

	public void setSorter(SortInterface sorter){
		this.sorter = sorter;
	}
}
