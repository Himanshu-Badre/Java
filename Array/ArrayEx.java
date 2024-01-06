package Array;
/*array is nothing but a similar type of homogeneus data stored in a array
 * declation of array
 * 
 * int arr[];
 * int [] arr;
 * int[] arr;
 * 
 * intsantitatin of arr
 * int arr[]=new int[5];
 * 
 * initialization of arr
 * arr[2]=3;
 * */
public class ArrayEx {
	public static void main(String[] args) {
		int arr[]= {10,40,43,41,99,80};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
}
