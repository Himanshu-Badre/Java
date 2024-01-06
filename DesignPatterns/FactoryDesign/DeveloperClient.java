package DesignPatterns.FactoryDesign;

public class DeveloperClient {

	public static void main(String[] args) {
		 
		Employee e = EmployeeFactory.getEmployee("Java Developer");
		
		
		System.out.println(e);
		System.out.println("Salary - " + e.salary());
		
		Employee e2 = EmployeeFactory.getEmployee("Web Developer");
		
		
		System.out.println(e2);
		System.out.println("Salary - " + e2.salary());
	}
}
