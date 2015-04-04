package package_02;

import package_01.Figure;

public class Circle extends Figure {

	private double PI = 3.1415;
	
	public Circle() {

	}

	public Circle(double radius){
		super(radius, radius);
	}
	
	@Override
	public double square() {
		return (getLength() * getWidth()) * PI;
	}

	@Override
	public double perimeter() {
		return 2*getLength()*PI;
	}
	
	@Override
	public String getType() {
		return "Окружность";
	}
}
