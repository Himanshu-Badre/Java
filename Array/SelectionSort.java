package Array;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = {23,56,1,67,8,12,0};
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] =arr[j];
					arr[j] =temp;
				}
			}
			System.out.print(arr[i]+", ");
		}
		
		System.out.println("Max = "+arr[0]);
		System.out.println("2nd Max = "+arr[1]);
		
		System.out.println("Min = "+arr[arr.length-1]);
		System.out.println("2nd Min = "+arr[arr.length-2]);
	}
}
/*
 * 1. Implement all sorting techniques
 * 2. WAP to find Max number from given array using single for loop
 * 3. WAP to find 2nd Max number from given array using single for loop
 * 4. What is Time complexity and space complexity
 * 
 * 
 * 
 */