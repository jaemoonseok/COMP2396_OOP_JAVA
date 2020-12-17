public class NonJUPASStudent extends Student {
	private double ieltsResult;

	public NonJUPASStudent(String n, double i) {
		super(n);
		this.ieltsResult = i;
	}
	
	public double getResult() {
		return ieltsResult;
	}
	// A missing method has to be implemented here!
}
