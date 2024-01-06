package basic;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = 0, sum = 0, no, temp = 0;
		System.out.println("Enter A Number");
		no = sc.nextInt();
		temp = no;
		while (no > 0) {
			r = no % 10;
			sum = sum + r * r * r;
			no = no / 10;
		}
		if (temp == sum) {
			System.out.println(temp + " Is Armstrong Number");
		} else {
			System.out.println(temp + " Is Not Armstrong Number");
		}
	}
}
