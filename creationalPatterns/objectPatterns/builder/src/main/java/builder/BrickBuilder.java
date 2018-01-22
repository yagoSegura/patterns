package builder;

import model.bricks.BrickFloor;
import model.bricks.BrickHouse;
import model.bricks.BrickWalls;
import model.bricks.BrickRoof;
import model.Walls;
import model.Roof;
import model.House;
import model.Floor;

public class BrickBuilder extends HouseBuilder{
	public Floor createFloor(){
		floor = new BrickFloor();
		return floor;
	}

	public House createHouse(){
		house = new BrickHouse();
		return house;
	}

	public Roof createRoof(){
		roof = new BrickRoof();
		return roof;
	}

	public Walls createWalls(){
		walls = new BrickWalls();
		return walls;
	}
}