package com.logica.decorator;

public class ConsoleLogger implements Logger{
	public void log(String msg){
		System.out.println("This log is written in console! "+msg);
	}
}