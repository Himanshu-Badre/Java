package PolyMorphism;

//Compiled Time Polymorphism
// same name but different parameters.z
// Method Overloading

public class Calculator {
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		Calculator C1=new Calculator();
		C1.add(10, 20);
		C1.add(10, 20, 30);
	}
}
