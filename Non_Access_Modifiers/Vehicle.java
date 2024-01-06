package Non_Access_Modifiers;

// final keyword 
//final access modifier which is used with class method and variable
public class Vehicle {
	final void start(){
	System.out.println("Vehicle Started");
	}
	public class bike extends Vehicle{
		final int speed=100;// constant
		final float pi=3.14f;
		void change() {
			speed=140;//cant reassigned the value of final variable constants
		}
		void start() { // cant override final method
			System.out.println("Bike");
		}
	}
}
