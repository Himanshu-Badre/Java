package Methods;

import java.util.Scanner;

public class PrimeMethod {
public static void main(String[] args) {
	int Number;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A Number");
	Number=sc.nextInt();
	Demo d1=new Demo();
	d1.Prime(Number);
	
 }
}
