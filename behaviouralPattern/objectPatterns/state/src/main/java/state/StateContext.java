package state;


public class StateContext{
	private State myState;

	public StateContext(){
		setState(new StateA());
	}

	public void setState(State stateName){
		this.myState = stateName;
	}
	
	public void writeName(String name){
		this.myState.writeName(this,name);
	}

}
