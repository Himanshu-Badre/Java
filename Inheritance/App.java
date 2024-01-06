package Inheritance;
//Single Level Inheritace
/*Inheritance is a process where we can access all the properties of parent class
 * that is data member and members function
 * by using extends keyword
 * */
class dog{
	void run() {
		System.out.println("Dog Is Running");
	}
}
class BabyDog extends dog{
	void sleep() {
		System.out.println("BabyDog Is Sleeping");
	}
}
public class App {
public static void main(String[] args) {
	BabyDog B1= new BabyDog();
	B1.run();
	B1.sleep();
}
}
