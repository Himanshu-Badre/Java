package Methods;

import java.util.Scanner;

public class Calculator {
void Add(int a,int b) {
	int c=a+b;
	System.out.println("Addition: "+c);
	}
void Sub(int a, int b) {
	int c=a-b;
	System.out.println("Substraction: "+c);
	}
void Mul(int a, int b) {
	int c=a*b;
	System.out.println("Multiplication: "+c);
	}
void Div(int a, int b) {
	int c=a/b;
	System.out.println("Division: "+c);
	}
public static void main(String[] args) {
	int No;
	Scanner sc= new Scanner(System.in);
	System.out.println("\t\tCalculator");
	System.out.println("1.Addition");
	System.out.println("2.Substraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	System.out.println("\tPlease Enter Operation:");
	No=sc.nextInt();
	System.out.println("Please Enter Two Numbers For Operation");
	int Number1=sc.nextInt();
	int Number2=sc.nextInt();
	Calculator c1=new Calculator();
	switch (No) {
	case 1: {
		c1.Add(Number1, Number2);
		break;
	}
	case 2:{
		c1.Sub(Number1, Number2);
		break;
	}
	case 3: {
		c1.Mul(Number1, Number2);
		break;
	}
	case 4: {
		c1.Div(Number1, Number2);
		break;
	}
	default: 
		System.out.println("You Made A Wrong Choice");
	}
	
}
}
