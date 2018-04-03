package app;

import handler.Handler;

public class ChainDemo{

	public static void main(String[] args){
		Handler chain_root = new Handler();
		chain_root.add(new Handler());
		chain_root.add(new Handler());
		chain_root.add(new Handler());
		chain_root.wrap_around(chain_root);

		for(int i= 1;i<=3;i++){
			chain_root.handle(i);
		}
	}
}