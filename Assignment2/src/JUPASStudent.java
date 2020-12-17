public class JUPASStudent extends Student {
	private double dseResult;

	public JUPASStudent(String n, double d) {
		super(n);
		this.dseResult = d;
	}
	
	public double getResult() {
		return dseResult;
	}
	// A missing method has to be implemented here!
}
