package Array;
//wap to find an element is present in array or not.
public class FindArray {
	public static void main(String[] args) {
		int arr[]= {1,3,5,7,9};
		int no=10;
		int i;
		boolean IsPresent=false;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==no) {
				 IsPresent=true;
				break;	
			}
		}
		if(IsPresent) {
			System.out.println(arr[i]+" Is Presentt");
		}else {
			System.out.println(no+" Is Not Presentt");
		}
	}
}
