package Exception_Handling;

import java.util.Scanner;

public class App {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int arr[] = {3, 4, 5, 0, 2};

		System.out.println("Enter index:");
		int index = sc.nextInt();

		int result = 0;
		
		if(index <= arr.length-1) {
			
			if(arr[index] != 0) {
				result = a / arr[index];
			}
		}else {
			System.out.println("Please enter correct input");
		}
	
		
		System.out.println(result);

		System.out.println("Program continuee.....");
	}
}
