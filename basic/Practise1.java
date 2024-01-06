package basic;

public class Practise1 {
public static void main(String[] args) {
	String InstituteName= "Technosignia";
	String StudentName="Himanshu";
	
	System.out.println("'"+InstituteName+" Institute Dange Chowk,Pune'");
	System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
	if(StudentName.equalsIgnoreCase("Himanshu")) {
	System.out.println(StudentName+" Is Technosignia's Student");
	}
	else if(StudentName.equalsIgnoreCase("Akshay")) {
		System.out.println(StudentName+" Is Technosignia's Student");
	}
	else if(StudentName.equalsIgnoreCase("Sumit")) {
		System.out.println(StudentName+" Is Technosigini's Student");
	}
	else if(StudentName.equalsIgnoreCase("Pritam")) {
		System.out.println(StudentName=" Is Technosignia's Student");
	}
	else {
		System.out.println("The Student Is Not From Technosignia Institute,pune");
	}
}
}
