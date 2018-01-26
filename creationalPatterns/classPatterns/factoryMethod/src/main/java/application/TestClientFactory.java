package application;

import product.ProductFactory;
import product.Product;

public class TestClientFactory{
	public static void main(String args[]){
		ProductFactory pf = new ProductFactory();
		Product prod;

		prod = pf.createProduct("A");
		prod.writeName("John Doe");

		prod = pf.createProduct("B");
		prod.writeName("John Doe");
	}
}