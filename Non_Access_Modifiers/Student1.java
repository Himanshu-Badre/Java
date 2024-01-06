package Non_Access_Modifiers;

public class Student1 {
	int rollno;
	String name;
	static String CollegeName;
	static {
		/* static block is used to initialize the static data members
		 * static block executed before the main method*/
		CollegeName="Technosignia";
		System.out.println("Static Block");
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
	}
}
