
public class Circle {
	private double x;
	private double y;
	private double r;

	public Circle(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public void setPosition(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void setRadius(double r) {
		this.r = r;
	}

	public double getPositionX() {
		return x;
	}

	public double getPositionY() {
		return y;
	}

	public double getRadius() {
		return r;
	}

	public double getArea() {
		return r * r * Math.PI;
	}

	public boolean isCollidedWith(Circle c) {
		if (Math.sqrt(Math.pow((this.x - c.x), 2) + Math.pow(this.y - c.y, 2)) < this.r + c.r) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Creating c1 and c2...\n");
		// Creates Circle objects
		Circle c1 = new Circle(20, 20, 10);
		Circle c2 = new Circle(30, 10, 3);
		// Test the advanced function - isCollidedWith()
		if (c1.isCollidedWith(c2) == true) {
			System.out.println("c1 and c2 collide");
		} else {
			System.out.println("c1 and c2 do not collide");
		}
	}

}
