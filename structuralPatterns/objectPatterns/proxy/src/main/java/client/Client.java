package client;

import cachedLogging.*;

public class Client{
	public static void main(String[] args){
		ICachedLogging logger = new CachedLoggingProxy();
		for(int i = 1;i < 5;i++){
			logger.logRequest("logString "+i);
		}
	}
}