package builder;

import model.House;
import model.Floor;
import model.Walls;
import model.roof;

public abstract class HouseBuilder{
	protected House house;
	protected Floor floor;
	protected Walls walls;
	protected Roof roof;

	public abstract House createHouse();
	public abstract Floor createFloor();
	public abstract Walls createWalls();
	public abstract Roof createRoof();
}