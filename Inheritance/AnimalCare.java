package Inheritance;
			//Multi Level Inheritance
			//Multiple Does Not SUpported By Java
class Animal{
	void eating() {
		System.out.println("Animal IS eating");
	}
}
class Cat extends Animal{
	void Walk() {
		System.out.println("Cat Is Walking");
	}
}
class Mouse extends Cat{
	void Run() {
		System.out.println("Mouse Is Running");
	}
}
public class AnimalCare {
public static void main(String[] args) {
	Mouse M1=new Mouse();
	M1.eating();
	M1.Walk();
	M1.Run();
}
}
