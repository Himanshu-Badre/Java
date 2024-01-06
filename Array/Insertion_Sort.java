package Array;

public class Insertion_Sort {
	 public static void main(String[] args) {
	        int arr[] = {5, 2, 9, 1, 5, 6};
	        System.out.println("Before Sorting : ");
	        for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j]+" ");
	        }
	        insertionSort(arr);
	        System.out.println("\nAfter Sorting array:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }

	    }
	    public static void insertionSort(int arr[]) {
	        int n = arr.length;

	        for (int i=1;i<n;i++) {
	            int current=arr[i];
	            int j=i-1;

	            while(j>=0&&arr[j]>current) {
	                arr[j+1]=arr[j];
	                j--;
	            }
	            arr[j+1]=current;
	        }
	    }
}
