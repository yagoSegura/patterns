package cachedLogging;

import java.util.ArrayList;
import java.util.List;

public class CachedLoggingProxy implements ICachedLogging{

	List<String> cachedLogEntries = new ArrayList<String>();
	CachedLogger cachedLogger = new CachedLogger(); 

	public void logRequest(String logString){
		addLogRequest(logString);
	}

	public void addLogRequest(String logString){
		cachedLogEntries.add(logString);
		if(cachedLogEntries.size() >= 4){
			performLogging();
		}
	}

	private void performLogging(){
		StringBuffer accumulatedLogString = new StringBuffer();
		for(String logString:cachedLogEntries){
			accumulatedLogString.append("\n"+logString);
			System.out.println("CachedLoggingProxy : adding logString \""+logString+"\" to cached log entries");
		}
		System.out.println("CachedLoggingProxy: sends accumulatedLogString to cachedLogger");
		cachedLogger.logRequest(accumulatedLogString.toString());
		cachedLogEntries.clear();
		System.out.println("CachedLoggingProxy : cachedLogEntries cleared. ");
	}
}