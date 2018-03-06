package com.logica.composite; 

public class CompositeDemo{
	public static void main(String[] args){
		
		Indentation indentation = new Indentation();
		
		Directory dirOne = new Directory("dir111",indentation);
		Directory dirTwo = new Directory("dir222",indentation);
		Directory dirThree = new Directory("dir333",indentation);

		File a = new File("a",indentation);
		File b = new File("b",indentation);
		File c = new File("c",indentation);
		File d = new File("d",indentation);
		File e = new File("e",indentation);

		dirOne.add(a);
		dirOne.add(dirTwo);
		dirOne.add(b);

		dirTwo.add(c);
		dirTwo.add(d);
		dirTwo.add(dirThree);

		dirThree.add(e);

		dirOne.ls();
	}
}