package package_01;

public class Figure {

	// field
	private double width;
	private double length;

	// constructors
	public Figure() {
	}

	public Figure(double length, double width) {
		if (width > 0 && length > 0) {
			this.width = width;
			this.length = length;
		}
	}

	protected double getWidth() {
		return width;
	}

	protected double getLength() {
		return length;
	}

	public void setWidth(double width) {
		if (width <= 0)
			throw new IllegalArgumentException();

		this.width = width;
	}

	public void setLength(double length) {
		if (length > 0)
			this.length = length;
	}

	// сделать бы этот метод абстрактным, как и весь класс
	public String getType() {
		return "";
	}

	// площадь и периметр, тоже должен быть абстрактным, т.к. все равно будет
	// переопределяться
	public double square() {
		return 0.0d;
	}

	public double perimeter() {
		return 0.0d;
	}

	@Override
	public String toString() {
		return "Тип фигуры: " + getType() + " с шириной " + width
				+ " и длиной " + length + ". Площадь фигуры: " + square()
				+ ". Периметр: " + perimeter();
	}
}
