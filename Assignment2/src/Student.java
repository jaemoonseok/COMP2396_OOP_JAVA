abstract class Student {
	protected String name;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	abstract double getResult();
}