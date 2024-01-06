package Non_Access_Modifiers;
//Static Variable;
public class Student {
	int rollno;
	String name;
	static String collegename="Technosignia";
	Student(int r,String n){
		this.rollno=r;
		this.name=n;
	}
	public static void main(String[] args) {
		Student s1=new Student(101,"Smith");
		Student s2=new Student(102,"John");
		System.out.println("ROll No: "+s1.rollno+" Name: "+s1.name);
		System.out.println("ROll No: "+s2.rollno+" Name: "+s2.name);
		System.out.println("College NAme: "+Student.collegename);
	}
}
/*static is a keyword and non access modifier and it is used for the memory management
we don't need to create an object to call the static variable
we can directly access through the class name	*/