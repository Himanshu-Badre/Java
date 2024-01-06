package Encapsulation;

public class User {
	public static void main(String[] args) {
		Employee E1=new Employee();
		E1.Setid(101);
		E1.Setname("Smith");
		Employee E2=new Employee();
		E2.Setid(102);
		E2.Setname("John");
		System.out.println("Name: "+E1.getname()+"\n ID : "+E1.getid());
		System.out.println("Name: "+E2.getname()+"\n ID : "+E2.getid());
	}
		
}
