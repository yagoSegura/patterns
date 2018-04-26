package org.mediator;

public class Mediator {
	ButtonView buttonView;
	ButtonBook buttonBook;
	ButtonSearch buttonSearch;
	LabelDisplay labelDisplay;

	public void registerView(ButtonView buttonView){
		this.buttonView = buttonView;
	}

	public void registerBook(ButtonBook buttonBook){
		this.buttonBook = buttonBook;
	}

	public void registerSearch(ButtonSearch buttonSearch){
		this.buttonSearch = buttonSearch;
	}

	public void registerDisplay(LabelDisplay labelDisplay){
		this.labelDisplay = labelDisplay;
	}

	public void view(){
		buttonView.setEnabled(false);
		buttonBook.setEnabled(true);
		buttonSearch.setEnabled(true);
		labelDisplay.setText("Viewing ...");
	}

	public void book(){
		buttonBook.setEnabled(false);
		buttonView.setEnabled(true);
		buttonSearch.setEnabled(true);
		labelDisplay.setText("Booking ...");
	}

	public void search(){
		buttonSearch.setEnabled(false);
		buttonBook.setEnabled(true);
		buttonView.setEnabled(true);
		labelDisplay.setText("Searching ...");
	}
}