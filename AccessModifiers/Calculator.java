package AccessModifiers;
/*private members are accessible within a class
 * default members are accessible outside the class within package
 * public members are accessible anywhere in the project
 *  */ 
public class Calculator {
	private Calculator() {
		System.out.println("Default");
	}
	private int max=100;//Private Variable
	private void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.max=200;
		c1.add(15, 30);;
	}
}
