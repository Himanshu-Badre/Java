package Inheritance;
//Hierarchical Inheritance

class Father{
	void Job() {
		System.out.println("Father Is Working At Microsoft");
	}
}
class Son extends Father{
	void Study() {
		System.out.println("Son Is Studying In MIT");
	}
}
class Daughter extends Father{
	void Actor() {
		System.out.println("Daughter Is AN Actor");
	}
}
public class Family {
public static void main(String[] args) {
	Son s1=new Son();
	Daughter D1=new Daughter();
	s1.Job();
	s1.Study();
	D1.Job();
	D1.Actor();
}
}
