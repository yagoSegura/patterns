package org.mediator;

import javax.swing.JLabel;

public class LabelDisplay extends JLabel {
	
	Mediator mediator;

	public LabelDisplay(Mediator mediator){
		super("Label display");
		this.mediator = mediator;
		mediator.registerDisplay(this);
	}
}