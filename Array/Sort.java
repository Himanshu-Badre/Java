package Array;
//wap to sort an array in ascending and descending order.
	public class Sort {
		public static void main(String[] args) {
		int arr[]= {20,2,5,50,36,1,15};
		
		for(int i=0;i<arr.length;i++) {
			
				for(int j=1;j<arr.length;j++) {
					
					if(arr[i]>arr[j]) {
						System.out.println(arr[j]);
						break;
					}
				}
			}
		}
 }

