package Protected;

import AccessModifiers.Dog;

public class BabyDog extends Dog{
	void run() {
		System.out.println("BabyDog Is Running");
	}
	public static void main(String[] args) {
		BabyDog B1=new BabyDog();
		B1.sleep();
		B1.run();
	}
}
