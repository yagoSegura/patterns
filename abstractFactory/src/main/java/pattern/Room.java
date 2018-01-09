package pattern;

import pattern.MapSite;
import utils.Direction;

public abstract class Room extends MapSite{

	private int roomNumber;
	private MapSite[] sides;

	public Room(int roomNumber){
		this.roomNumber = roomNumber;
	}

	public abstract void enter();

	public void setSide(Direction direction,MapSite mapSite){}

	public MapSite getSide(Direction direction){
		return null;
	}
}