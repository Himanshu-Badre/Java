package basic;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int r=0,sum=0,no,temp=0;
		System.out.println("Enter A Number");
		no=sc.nextInt();
		temp=no;//Store Original Value 
		while(no>0) {
			r=no%10;//it will give last digit, i.e. remainder
			sum=(sum*10)+r;
			no=no/10;//it will give 2 digits that is quotient
		}
		if(temp==sum) {
			System.out.println(temp+" Is Palindrome Number");
		}else {
			System.out.println(temp+" Is Not Palindrome Number");
		
}
	}
}
