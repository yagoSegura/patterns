package adapter;

import external.FileManagerUtil;
import filemanager.FileManager;

public class FileManagerImpl extends FileManagerUtil implements FileManager{
	public String close(){
		return new Boolean(closeFile()).toString();
	}

	public String open(String s){
		return new Boolean(openFile(s)).toString();
	}

	public String read(int pos,int amount,byte[] data){
		return readFromFile(pos,amount);
	}

	public String write(int pos,int amount, byte[] data){
		boolean tmp = writeToFile(new String(data),pos,amount);
		return String.valueOf(tmp);
	}
}