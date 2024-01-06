package Exception_Handling;

import java.util.Scanner;

public class MultiCatch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter Index");
		int index=sc.nextInt();
		int arr[]= {3,4,5,0,2};
		int result=0;
			try {
				result=a/arr[index];
//				System.exit(0);//finally will not execute
			}catch (ArithmeticException e) {
				System.out.println("ArithmeticException Handled");
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException Handled");
			}catch (Exception e) {
				System.out.println("Exception Handled");
			}finally {
				sc.close();
				System.out.println("Program Continued...");
			}
	}
}
