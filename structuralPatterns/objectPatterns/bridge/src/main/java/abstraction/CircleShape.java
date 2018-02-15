package abstraction;

import abstraction.Shape;
import implementor.DrawingAPI;

// Refined abstraction
public class CircleShape implements Shape{
	private double x,y,radius;
	private DrawingAPI drawingAPI;

	public CircleShape(double x, double y, double radius,DrawingAPI drawingAPI){
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.drawingAPI = drawingAPI;
	}

	// implementation specific
	public void draw(){
		drawingAPI.drawCircle(x,y,radius);
	}

	// abstraction specific
	public void resizeByPercentaje(double pct){
		radius *= pct; 
	}
}

