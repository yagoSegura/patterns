package application;

import director.HouseDirector;
import model.*;
import builder.*;

public class HouseClient{
	public static void main(String[] args){
		HouseDirector director = new HouseDirector();
		HouseBuilder woodBuilder = new WoodBuilder();
		HouseBuilder brickBuilder = new BrickBuilder();

		// Build a wooden house
		House woodHouse = director.constructHouse(woodBuilder);

		// Buils a brick house 
		House brickHouse = director.constructHouse(brickBuilder);
	}
}