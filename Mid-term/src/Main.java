import java.util.*;

public class Main {
	public static void main(String[] args) {
		Real r1 = new Real(3);
		Real r2 = new Real(5);
		Complex c1 = new Complex(1, 2);
		Complex c2 = new Complex(3, 4);
		r1.add(r2);
		r1.print();
		r1.subtract(r2);
		r1.print();
		c1.add(c2);
		c1.print();
		c1.subtract(c2);
		c1.print();
		c1.add(r1);
		c1.print();
		System.out.println(Number.numNumbers);
		ArrayList<Number> num = new ArrayList<Number>();
		num.add(new Real(3));
		num.add(new Real(6));
		num.add(new Real(9));
		num.add(new Complex(2,4));
		num.add(new Complex(6,8));
		num.add(new Complex(10,12));
		for (Number number: num) {
			number.print();
		}
	}
}