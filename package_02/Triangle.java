package package_02;

import package_01.Figure;

public class Triangle extends Figure {

	public Triangle() {
	}

	public Triangle(double length, double width) {
		super(length, width);
	}

	@Override
	public double square() {
		return (getLength() * getWidth()) / 2;
	}

	@Override
	public double perimeter() {

		double a = getLength();
		double b = getWidth();
		double c;

		c = Math.sqrt(a*a + b*b);

		return a + b + c;
	}

	@Override
	public String getType() {
		return "Треугольник";
	}
}
