package org.mediator;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class ButtonView extends JButton implements Command{
	Mediator mediator;

	ButtonView(ActionListener listener,Mediator mediator){
		super("View");
		addActionListener(listener);
		this.mediator = mediator;
		mediator.registerView(this);
	}

	public void execute(){
		mediator.view();
	}
} 