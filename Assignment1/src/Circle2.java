public class Circle2 {
	private Position p;
	private double r;

	public Circle2(Position p, double r) {
		this.p = p;
		this.r = r;
	}

	public void setPosition(Position p) {
		this.p = p;
	}

	public void setRadius(double r) {
		this.r = r;
	}

	public Position getPosition() {
		return p;
	}

	public double getRadius() {
		return r;
	}

	public double getArea() {
		return r * r * Math.PI;
	}

	public boolean isCollidedWith(Circle2 c) {
		if (Math.sqrt(Math.pow(this.p.getX() - c.p.getX(), 2) + Math.pow(this.p.getY() - c.p.getY(), 2)) < this.r + c.r) {
			return true;
		} else {
			return false;

		}
	}

	public static void main(String[] args) {
		Circle2 c1 = new Circle2(new Position(10, 10), 5);
		Circle2 c2 = new Circle2(new Position(20, 10), 5);
		System.out.println("Reporting c1:");
		System.out.println("r: " + c1.getRadius());
		System.out.println("Area:" + c1.getArea());
		c1.setPosition(new Position(18, 10));
		Position c1_p = c1.getPosition();
		System.out.println("c1 is now at " + c1_p.getX() + ", " + c1_p.getY());
		if (c1.isCollidedWith(c2) == true) {
			System.out.println("c1 and c2 collide");
		} else {
			System.out.println("c1 and c2 do not collide");
		}
	}
}
