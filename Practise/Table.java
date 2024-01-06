package Practise;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Any Number");
		int a=sc.nextInt();
		for(int i=0;i<10;i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
	}
}
