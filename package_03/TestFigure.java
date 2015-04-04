package package_03;

import package_01.Figure;
import package_02.*;

public class TestFigure {

	public static void main(String[] args) {
		
		double l = 4.0;
		double w = 3.0;
		
		Figure circle = new Circle(l);
		Figure triangle = new Triangle(l, w);
		Figure rectangle = new Rectangle(l, w);

		System.out.println(circle.toString());
		System.out.println(triangle.toString());
		System.out.println(rectangle.toString());
		
	}

}
