// Memento.java
package com.memento;

public class Memento{
	private String state;

	public Memento(String stateToSave){
		state = stateToSave;
	} 

	public String getSavedState(){
		return state;
	}

}