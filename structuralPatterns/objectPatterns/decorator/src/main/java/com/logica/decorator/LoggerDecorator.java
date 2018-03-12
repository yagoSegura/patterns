package com.logica.decorator;

public class LoggerDecorator implements Logger{
	Logger logger;

	public LoggerDecorator(Logger logger){
		this.logger = logger;
	}

	public void log(String msg){
		logger.log(msg);
	}
}