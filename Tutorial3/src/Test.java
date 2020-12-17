public class Test {
public static void main(String[] args) {
System.out.println("Creating circles...");
Circle c1=new Circle();
Circle c2=new Circle(5);
Circle c3=new Circle(12,"green",true);
System.out.println("Getting the diameter of the circles...");
System.out.println("C1: "+c1.getDiameter());
System.out.println("C2: "+c2.getDiameter());
System.out.println("C3: "+c3.getDiameter());
System.out.println("Setting a new diameter of C2...");
c2.setDiameter(16);
System.out.println("The new perimeter of C2...");
System.out.println("C2: "+c2.getPerimeter());
System.out.println("Setting new color and filled of c2...");
c2.setColor("blue");
c2.setFilled(true);
System.out.println("Getting the information of c2...");
System.out.println("C2 Color: "+c2.getColor()+ " Filled: "+c2.getFilled());
System.out.println("Total number of circles created...");
System.out.println(Circle.getNumberOfObjects());
}
}
