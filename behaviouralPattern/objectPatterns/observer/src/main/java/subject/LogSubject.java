package subject;

import java.util.ArrayList;
import java.util.List;

import observer.IObserver;

public class LogSubject{
	private List<IObserver> observerList = new ArrayList<IObserver>();

	private String state;

	public void attach(IObserver observer){
		observerList.add(observer);
	}

	public void detach(IObserver observer){
		observerList.remove(observer);
	}


	public void setState(String state) {
		this.state = state;
		this.stateChanged();
	}

	public String getState() {
		return state;
	}

	public void stateChanged(){
		for(IObserver item:observerList){
			item.update(this.getState());
		}
	}
}
