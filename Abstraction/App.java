package Abstraction;
/*
 * abstraction is a process or hiding internal details
 * or implementation only show you essential data
 * is called abstraction
 * 
 * abstract class cannot be instantiated i.e
 * we can't create object of abstract class*/
abstract class bank{
	abstract void displayName();// method declaration
}
class sbi extends bank{
	void displayName(){//when we use abstract class we  must override its method or else we get error
		System.out.println("SBI Bank");
	}
}
public class App {
	public static void main(String[] args) {
		bank b1=new sbi();//upcasting where b1 is a object of child class with reference of parent class
		b1.displayName();
	}
}
