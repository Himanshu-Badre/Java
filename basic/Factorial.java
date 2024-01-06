package basic;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	int fact=1,i,no;
	Scanner sc= new Scanner(System.in);
	System.out.println("Please Enter A Number");
	no=sc.nextInt();
	for(i=1;i<=no;i++) {
		fact=fact*i;
	}
	System.out.println("Factorial of "+no+" Is "+fact);
}
}
