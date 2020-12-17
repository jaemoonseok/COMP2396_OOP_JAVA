
public class Complex extends Number {
	int imaginaryPart;

	public Complex(int rp, int ip) {
		super(rp);
		this.imaginaryPart = ip;
	}

	public void add(Real r) {
		this.realPart += r.realPart;
	}

	public void add(Complex c) {
		this.realPart += c.realPart;
		this.imaginaryPart += c.imaginaryPart;
	}

	public void subtract(Real r) {
		this.realPart -= r.realPart;
	}

	public void subtract(Complex c) {
		this.realPart -= c.realPart;
		this.imaginaryPart -= c.imaginaryPart;
	}

	public void print() {
		System.out.println(this.realPart + " + " + this.imaginaryPart + "i");
	}
}
