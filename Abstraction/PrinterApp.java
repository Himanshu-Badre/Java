package Abstraction;
import java.util.Scanner;

abstract class Printable {
	abstract void print();
}

class A4 extends Printable {

	void print() {
		System.out.println("Printing A4 size pages");
	}
}

class A6 extends Printable {
	void print() {
		System.out.println("Printing a6 size pages");
	}
}

public class PrinterApp {

	public static void main(String args[]) {
		System.out.println("Enter page size to print");
		Scanner sc = new Scanner(System.in);
		String pageSize = sc.next();
		Printable p1 = null;
		if (pageSize.equalsIgnoreCase("A4")) {
			p1 = new A4();
		} else if (pageSize.equalsIgnoreCase("A6")) {
			p1 = new A6();
		}
		if (p1 != null) {
			p1.print();
		} else {
			System.out.println("Invalid page size");
		}

	}
}
