package pattern;

import pattern.MapSite;
import utils.Direction;

public class Room extends MapSite{

	private int roomNumber;
	private MapSite[] sides;

	public Room(int roomNumber){
		this.roomNumber = roomNumber;
	}

	public void enter(){};

	public void setSide(Direction direction,MapSite mapSite){}

	public MapSite getSide(Direction direction){
		return null;
	}
}