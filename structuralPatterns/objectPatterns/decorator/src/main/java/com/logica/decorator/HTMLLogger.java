package com.logica.decorator;

public class HTMLLogger extends LoggerDecorator{
	public HTMLLogger(Logger logger){
		super(logger);
	}

	public void log(String msg){
		msg = makeHTML(msg);
		logger.log(msg);
	}

	private String makeHTML(String msg){
		msg = "<html><body>"+"<b>"+msg+"</b></body></html>";
		return msg;
	}
}