package pattern;

import pattern.MapSite;

public class Door extends MapSite{

	private boolean isOpen;
	private Room _room1;
	private Room _room2;

	public Door(Room _room1,Room _room2){}

	public void enter(){}

	public Room otherSideFrom(Room room){
		return null;
	}
}