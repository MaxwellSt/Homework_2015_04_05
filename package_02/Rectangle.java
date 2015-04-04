package package_02;

import package_01.Figure;

public class Rectangle extends Figure {

	public Rectangle() {
	}

	public Rectangle(double length, double width) {
		super(length, width);
	}

	@Override
	public double square() {
		return getLength() * getWidth();
	}

	@Override
	public double perimeter() {
		return 2 * (getLength() + getWidth());
	}

	@Override
	public String getType() {
		return "Прямоугольник";
	}
}
