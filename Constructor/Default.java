package Constructor;
//This IS Default Constructor
public class Default {
	Default(){
		System.out.println("Object IS Created");
	}
	public static void main(String[] args) {
		Default D1=new Default();/*
		new keyword allocated memory to object in heap area;
		jvm creates default constructor if we didnt create it.
		 */
	}
}
//Default Constructor 