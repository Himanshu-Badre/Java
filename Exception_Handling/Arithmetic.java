package Exception_Handling;

import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=0;
			try {
					result=a/b;
				}catch(ArithmeticException e) {
					System.out.println("Cant Divide Any Number By Zero");
				}
		System.out.println(result);
		System.out.println("Program Continued...");
	}
}
