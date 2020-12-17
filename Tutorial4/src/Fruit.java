
public class Fruit {
	private String color;
	private static int numberOfFruits = 0;
	private String shape;
	
	public Fruit(String color, String shape) {
		this.color = color;
		this.shape = shape;
		numberOfFruits++;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getShape() {
		return shape;
	}
	
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	public String howToEat() {
		return "Eat it fresh";
	}
	
	public static int getNumberOfFruits() {
		return numberOfFruits;
	}
}
