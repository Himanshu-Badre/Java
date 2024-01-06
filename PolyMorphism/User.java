package PolyMorphism;

//Method Overriding
import java.util.Scanner;

class RBIBAnk {
	float getROI() {
		return 4.8f;
	}
}

class HDFC extends RBIBAnk {
	float getROI() {
		return 7.8f;
	}
}

class AXIS extends RBIBAnk {
	float getROI() {
		return 9.5f;
	}
}

class BOI extends RBIBAnk {
	float getROI() {
		return 12.05f;
	}
}

public class User {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bank NAme : ");
		String BankName = sc.next();
		RBIBAnk RB1 = null;
		if (BankName.equalsIgnoreCase("HDFC")) {
			RB1 = new HDFC();
			System.out.println("HDFC ROI : " + RB1.getROI());
		} else if (BankName.equalsIgnoreCase("Axis")) {
			RB1 = new AXIS();
			System.out.println("AXIX ROI : " + RB1.getROI());
		} else if (BankName.equalsIgnoreCase("BOI")) {
			RB1 = new BOI();
			System.out.println("BOI ROI : " + RB1.getROI());
		} else if (BankName.equalsIgnoreCase("RBIBAnk")) {
			RB1 = new RBIBAnk();
			System.out.println("RBIBAnk ROI : " + RB1.getROI());
		} else {
			System.out.println("Please Enter Correct Bank Name\n Thankyou!");
		}
	}
}
