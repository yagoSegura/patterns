package com.logica.command;

import com.logica.receiver.Light;

public class TurnOffLightCommand implements Command{
	private Light theLight;

	public TurnOffLightCommand(Light light){
		this.theLight = light;
	}

	public void execute(){
		this.theLight.turnOff();
	}
}