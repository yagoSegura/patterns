package application;

import logger.FileLogger;

public class LogApplication{
	public static void main(String[] args){
		
		FileLogger logger = FileLogger.getInstance();
		logger.log("This is a new message");

		FileLogger logger2 = FileLogger.getInstance();
		logger.log("This is a message using the same object than before");
	}
}