
package state;

public class StateA implements State{
	
	public void writeName(StateContext stateContext,String name){
		System.out.println(name.toLowerCase());
		stateContext.setState(new StateB());
	}

}
