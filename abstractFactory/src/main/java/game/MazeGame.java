package game;

import pattern.Maze;
import pattern.Room;
import pattern.Door;
import pattern.Wall;
import utils.Direction;

public class MazeGame{

	public static void main(String[] args) {
			Maze aMaze = new Maze();
			Room r1 = new Room(1);
			Room r2 = new Room(2);
			Door theDoor = new Door(r1,r2);

			r1.setSide(Direction.North,new Wall());
			r1.setSide(Direction.East,theDoor);
			r1.setSide(Direction.South,new Wall());
			r1.setSide(Direction.West,new Wall());

			r2.setSide(Direction.North,new Wall());
			r2.setSide(Direction.East,new Wall());
			r2.setSide(Direction.South,new Wall());
			r2.setSide(Direction.West,theDoor);
	}
}