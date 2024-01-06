package basic;

public class Swap {
	public static void main(String args[]) {
		int a=20,b=30;
		int c=0;
		System.out.println("Before Swapping");
		System.out.println("a= "+a+" b= "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping: ");
		System.out.println("a="+a+" b= "+b);
		/* Swapping Without Using Third Variable
		 * a=a+b;
		 * b=a-b;
		 * a=a-b;
		 * */
	}
}
