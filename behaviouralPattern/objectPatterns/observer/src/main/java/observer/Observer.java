package	observer;

public class Observer implements IObserver{
	
	private String state;

	
	public void update(String state){
		setState(state);
		System.out.println("Observer has received update signal with new state : "+state);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
