package DesignPatterns;

import java.util.Scanner;

public class App {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			RBIBank rb1 = null;
			BankFactory bf = new BankFactory();

			System.out.println("Enter a bank name to check ROI");
			String bankName = sc.next();

			rb1 = bf.getObject(bankName);
			if (rb1 == null) {
				System.out.println("Please enter correct Bank Name");
			} else {
				System.out.println(rb1.getROI());
			}

		}

}
