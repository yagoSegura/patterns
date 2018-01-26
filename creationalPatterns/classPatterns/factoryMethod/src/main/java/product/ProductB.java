package product;

import product.Product; 

public class ProductB extends Product{
    
    public void writeName(String name){
    	StringBuilder tempName = new StringBuilder().append(name);
    	System.out.println("My reversed name is "+tempName.reverse());
    }
}
