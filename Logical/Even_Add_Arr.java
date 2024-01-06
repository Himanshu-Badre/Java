package Logical;

public class Even_Add_Arr {
	public static void main(String[] args) {
		int[] a= {2,4,5,8,6,9,7,5,8,7,9,4};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+ " ");
				sum=sum+a[i];
			}
		}
		System.out.println("\nSum : "+sum);
	}
}
