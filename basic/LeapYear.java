package basic;

import java.util.Scanner;

/* WAP to check whether it is leap year is or not */
public class LeapYear {
	public static void main(String[] args) {
		int Year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter A Year");
		Year=sc.nextInt();
		if((Year%400==0) ||(Year%100!=0) && (Year%4==0)) {
			System.out.println(Year+" Is Leap Year");
		}else {
		System.out.println(Year+" Is Not a Leap Year");
		}
	}
}
//2012 Is Leap Year