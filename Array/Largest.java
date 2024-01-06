package Array;
//wap to find largest number in given array
//Bubble Sort
	public class Largest {
		
		public static void main(String[] args) {
			int arr[]= {70,50,80,20,70,60,60,80,70,80,60,20,70,80,50};
			int largest=arr[0];
			int secondlarge=1;
			
			for(int i=0;i<arr.length;i++) {
				
				if(arr[i]>largest) {
					secondlarge=largest;
					largest=arr[i];
				}
				else if(secondlarge<arr[i] && largest!=arr[i]) {
					secondlarge=arr[i];
				}
			}
			
			System.out.println("Largest "+largest);
			System.out.println("Second Largest "+secondlarge);
		}
}
