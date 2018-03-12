package com.logica.decorator;

public class LoggerFactory{
	public static final String TYPE_CONSOLE_LOGGER = "console";
	public static final String TYPE_FILE_LOGGER = "file";

	public Logger getLogger(String type){
		if(TYPE_CONSOLE_LOGGER.equals(type)){
			return new ConsoleLogger();
		}else{
			return new FileLogger();
		}
	}
}