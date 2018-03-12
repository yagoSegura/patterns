package com.logica.decorator;

public class FileLogger implements Logger{
	public void log(String msg){
		System.out.println("This is a file log "+msg);
	}
}