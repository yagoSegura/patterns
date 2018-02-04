package logger;

public class FileLogger{

	private static FileLogger logger;

	// prevent clients for using the constructor
	private FileLogger(){}

	public static FileLogger getInstance(){
		if(logger == null){
			logger = new FileLogger();
		}
		return logger;
	}

	public synchronized void log(String msg){
		System.out.println("log the message: "+msg);
	}
}