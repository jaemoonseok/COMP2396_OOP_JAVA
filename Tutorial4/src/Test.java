public class Test {
	public static void main(String[] args) {
		Fruit f1=new Apple("Green","Conical",1.5);
		Fruit f2=new Apple("Red","Long Conical");
		Fruit f3=new Cherry("Black","Round");
		System.out.println("How to eat a cherry?");
		System.out.println(f3.howToEat());
		System.out.println("What is the color and shape of a cherry?");
		System.out.println(f3.getColor()+" and "+ f3.getShape());
		System.out.println("How to eat an apple?");
		System.out.println(f2.howToEat());
		System.out.println("What is the color and shape of the second apple created?");
		System.out.println(f2.getColor()+" and "+f2.getShape());
		System.out.println("Setting a new color, shape and radius of the first apple... ");
		f1.setColor("Red");
		f1.setShape("Round Conical");
		Apple a=(Apple)f1;
		a.setRadius(2);
		System.out.println("What is the color, shape and the radius of the first apple created after modifying?");
		System.out.println(f1.getColor()+ " and "+ f1.getShape()+ " and "+ a.getRadius());
		System.out.println("How many fruits are created in total?");
		System.out.println(Fruit.getNumberOfFruits());
	}}