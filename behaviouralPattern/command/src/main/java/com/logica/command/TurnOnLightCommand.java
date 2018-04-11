package com.logica.command;

import com.logica.receiver.Light;

public class TurnOnLightCommand implements Command{
	private Light theLight;

	public TurnOnLightCommand(Light light){
		this.theLight = light;
	}

	public void execute(){
		this.theLight.turnOn();
	}
}