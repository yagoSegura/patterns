package com.logica.composite;

public class Indentation{
	private StringBuffer sbIndent = new StringBuffer();

	public String getIndentation(){
		return sbIndent.toString();
	}

	public void increaseIndentation(){
		sbIndent.append("	");
	}

	public void decreaseIndentation(){
		if(sbIndent.length() >= 3){
			sbIndent.setLength(sbIndent.length() - 3);
		}
	}
}