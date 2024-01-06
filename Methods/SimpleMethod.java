package Methods;

public class SimpleMethod {
	void Addition(int a, int b) {
		int c = a + b;
		System.out.println("Addition: " + c);
	}

	void Multiplication(int a, int b) {
		int c = a * b;
		System.out.println("Multiplication: " + c);
	}

	void SubStraction(int a, int b) {
		int c = a - b;
		System.out.println("Substraction: " + c);
	}

	public static void main(String[] args) {
		SimpleMethod Sm = new SimpleMethod();
		/* new keyword allocates memory to object */
		Sm.Addition(45, 50);
		Sm.Multiplication(10, 5);
		Sm.SubStraction(50, 20);
	}
}
