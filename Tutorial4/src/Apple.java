
public class Apple extends Fruit {
	private double radius = 1;

	public Apple(String color, String shape) {
		super(color, shape);
	}

	public Apple(String color, String shape, double radius) {
		super(color, shape);
		this.radius = radius;
	}

	public String howToEat() {
		return "Make Apple Juice";
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
