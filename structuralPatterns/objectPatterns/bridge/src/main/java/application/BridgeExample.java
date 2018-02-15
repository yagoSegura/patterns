package application;

import abstraction.Shape;
import abstraction.CircleShape;
import implementor.DrawingAPI1;
import implementor.DrawingAPI2;

public class BridgeExample{
	public static void main(String[] args){
		Shape[] shapes = new Shape[2];
		shapes[0] = new CircleShape(1,2,3,new DrawingAPI1());
		shapes[1] = new CircleShape(1,2,3,new DrawingAPI2());

		for(Shape shape : shapes){
			shape.resizeByPercentaje(2.5);
			shape.draw();
		}
	}
}