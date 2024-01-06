package Inheritance;

		//Hierarchical Inheritance

class Flower {
	void DisplayANme() {
		System.out.println("This Is Flower Name");
	}
}

class Rose extends Flower {
	String GetColour() {
		return "Red";
	}
}

class Lotus extends Flower {
	String GetFragrance() {
		return "Good";
	}
}

public class FlowerApp {
	public static void main(String[] args) {
		Rose R1 = new Rose();
		R1.DisplayANme();
		System.out.println(R1.GetColour());
		Lotus L1 = new Lotus();
		L1.DisplayANme();
		System.out.println(L1.GetFragrance());
	}
}
