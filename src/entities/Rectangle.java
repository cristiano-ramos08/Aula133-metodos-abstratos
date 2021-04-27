package entities;
import entities.enums.Color;

public class Rectangle extends Shape {
	
	private Double width;
	private double height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(Color color, Double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}


	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	@Override
	public double area() {
		return width * height;
	}

}
