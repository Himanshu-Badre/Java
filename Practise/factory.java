package Practise;

import java.util.Scanner;

public class factory {
	public void getxerox()
	{
	System.out.println("The xerox are processing");
	}
	}

	class A4 extends xerox{
	public void getxerox()
	{
	System.out.println("The A4 size page are printing");
	}
	}
	class colorprint extends xerox
	{
	public void getxerox()
	{
	System.out.println("The color page are printing");
	}
	}
	class bothside extends xerox
	{
		public void getxerox()
	{
	System.out.println("The both side printing are processing");
	}
	}


	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the type of xerox you want?");
	String xeroxname=sc.next();

	xerox r1=null;

		if(xeroxname.equalsIgnoreCase("A4"))
		{
		r1=new A4();
		}
		else if(xeroxname.equalsIgnoreCase("colorprint"))
		{
		r1=new colorprint();
		}
		else if(xeroxname.equalsIgnoreCase("bothside"))
		{
		r1=new bothside();
		}
		else {
		System.out.println("No details are found for xerox"+xeroxname);
		}
		if(r1 != null )
		{
		System.out.println(xeroxname+"Type of xerox are:"+r1.getxerox());
		}
		}
}
