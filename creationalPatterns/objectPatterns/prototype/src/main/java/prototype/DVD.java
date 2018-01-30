package prototype;

import prototype.Product;

public class DVD extends Product{
	private int duration;

	public int getDuration(){
		return duration;
	}

	public void setDuration(int i){
		duration = i;
	}
}