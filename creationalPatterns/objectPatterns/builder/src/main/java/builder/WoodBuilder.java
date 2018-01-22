package builder;

import model.wood.WoodRoof;
import model.wood.WoodHouse;
import model.wood.WoodFloor;
import model.wood.WoodWalls;
import model.Walls;
import model.Roof;
import model.House;
import model.Floor;

public class WoodBuilder extends HouseBuilder{

	public Floor createFloor(){
		floor = new WoodFloor();
		return floor;
	}

	public House createHouse(){
		house = new WoodHouse();
		return house;
	}

	public Roof createRoof(){
		roof = new WoodRoof();
		return roof;
	}

	public Walls createWalls(){
		walls = new WoodWalls();
		return walls;
	}
}