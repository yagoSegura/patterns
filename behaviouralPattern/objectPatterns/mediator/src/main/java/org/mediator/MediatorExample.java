package org.mediator;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MediatorExample extends JFrame implements ActionListener{
	Mediator mediator = new Mediator();
	ButtonView buttonView = new ButtonView(this,mediator);
	ButtonBook buttonBook = new ButtonBook(this,mediator);
	ButtonSearch buttonSearch = new ButtonSearch(this,mediator);

	public MediatorExample(){
		JPanel p = new JPanel();
		
		p.add(buttonView);
		p.add(buttonBook);
		p.add(buttonSearch);

		getContentPane().add(new LabelDisplay(mediator),BorderLayout.NORTH);
		getContentPane().add(p,BorderLayout.SOUTH);

		setTitle("Mediator Example");
		setSize(300,200);

		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		System.out.println("Accion realizada : "+ e.getActionCommand());
		if(e.getActionCommand().equals("Book")){
			buttonBook.execute();
		}
		if(e.getActionCommand().equals("Search")){
			buttonSearch.execute();
		}
		if(e.getActionCommand().equals("View")){
			buttonView.execute();
		}
	}

	public static void main(String[] args){
		new MediatorExample();
	}
}
