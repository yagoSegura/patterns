package application;

public class HouseClient{
	public static void Main(String[] args){
		HouseDirector = new HouseDirector();
		HouseBuilder woodBuilder = new WoodBuilder();
		HouseBuilder brickBuilder = new BrickBuilder();

		// Build a wooden house
		House woodHouse = director.constructHouse(woodBuilder);

		// Buils a brick house 
		House brickHouse = director.constructHouse(brickBuilder);
	}
}