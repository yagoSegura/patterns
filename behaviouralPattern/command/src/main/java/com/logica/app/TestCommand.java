package com.logica.app;

import com.logica.command.Command;
import com.logica.command.TurnOnLightCommand;
import com.logica.command.TurnOffLightCommand;
import com.logica.receiver.Switch;
import com.logica.receiver.Light;

public class TestCommand{
	public static void main(String[] args){
		Light l = new Light();
		
		Command switchUp = new TurnOnLightCommand(l);
		Command switchDown = new TurnOffLightCommand(l);

		Switch s = new Switch(switchUp,switchDown);
		s.flipUp();
		s.flipDown();

	}
}