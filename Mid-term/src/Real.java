
public class Real extends Number{
	
	public Real(int rp) {
		super(rp);
	}
	
	public void add(Real r) {
		this.realPart += r.realPart;
	}
	
	public void subtract(Real r) {
		this.realPart -= r.realPart;
	}
	
	public void print() {
		System.out.println(this.realPart);
	}
}
