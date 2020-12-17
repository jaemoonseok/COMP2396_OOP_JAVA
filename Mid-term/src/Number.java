abstract class Number {
	public int realPart;
	public static int numNumbers = 0;

	public Number(int rp) {
		realPart = rp;
		numNumbers++;
	}

	abstract void print();
}
