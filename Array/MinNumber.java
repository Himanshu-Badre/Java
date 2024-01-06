package Array;
//wap to find minimum number from given array
//Bubble Sort
	public class MinNumber {
		public static void main(String[] args) {
			int arr[]= {20,25,35,45,5,5,20,40,3,2,1,3,2,1,3,2,1,2,1,3,};
			int min=arr[0];
			int secondmin=arr[0];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<min) {
					secondmin=min;
					min=arr[i];
				}
				else if(secondmin>arr[i] && min!=arr[i]) {
					min=arr[i];
				}
			}
			System.out.println("Min Number: "+min);
			System.out.println("Second Min Number: "+secondmin);
		}
}
