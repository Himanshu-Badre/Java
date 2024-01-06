package basic;

import java.util.Scanner;

public class SwitchPractise {
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	int no=0,numb;
	String choice=null,select;
	do {
		System.out.println("==================================================");
		System.out.println(" Welcome to Technoagina Institute, Pune");
		System.out.println("_______________________________________");
		System.out.println("  Are You Here For...?");
		System.out.println("==================================================");

		System.out.println("1. Inquiry");
		System.out.println("2. Admission");
		System.out.println("==================================================");

		System.out.println("Please Make Choice From above...!");
		no=sc.nextInt();
		
		switch(no) {
		case 1:
			System.out.println("For Which Course You Want To Make Inquiry");
			System.out.println("==================================================");
			System.out.println("*_*_*_*_*_*_ A. Java Development *_*_*_*_*_*_*_*");
			System.out.println("*_*_*_*_*_*_ B. Software Testing *_*_*_*_*_*_*_*_*");
			System.out.println("=====================================================");
			System.out.println("Please Enter Course Number:  ");
			select=sc.next();
			if(select.equalsIgnoreCase("A")) {
				System.out.println("In Java Dvelopment Course You will learn About\n Web-Development Using Java");
				System.out.println("_______________________________________________________");
			}else if(select.equalsIgnoreCase("B")) {
				System.out.println("In Software Testing You Will Learn About\n Automation Testing Where You will Test The Bugs ");
				System.out.println("______________________________________________________");
			}else
				System.out.println("You Make Wrong Choice...!");
			break;
		case 2:
			System.out.println("================================================");
			System.out.println("For Which Course You Want To Take Admission...!");
			System.out.println("*_*_*_*_*_*_ 1. Java Development *_*_*_*_*_*_*_*");
			System.out.println("*_*_*_*_*_*_ 2. Software Testing *_*_*_*_*_*_*_*_*");
			System.out.println("==================================================");
			System.out.println("Please Enter Course Number:  ");
			numb=sc.nextInt();
			if(numb==1) {
				System.out.println("Congtratulations Your Admission For\n Java Development Is Confirmed!!! \nYou Can Join From Tomorrow ");
				System.out.println("__________________________________________________________________");
			}else if(numb==2) {
				System.out.println("Congtratulations Your Admission For\n Software Testing Is Confirmed!!! \nYou Can Join From Tomorrow");
				System.out.println("____________________________________________________________");
			}else
			{
				System.out.println("You Make Wrong choice");
			}
			break;
		default:
			System.out.println("Wrong Choice");
		}
		System.out.println("Do You Want More Information...? (Yes/No)");
		choice=sc.next();
		
	}while(choice.equalsIgnoreCase("yes"));
	System.out.println("Thank You Visit Again...!");
}
}
