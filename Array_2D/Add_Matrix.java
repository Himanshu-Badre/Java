package Array_2D;

public class Add_Matrix {
	public static void main(String[] args) {
		int arr[][]= {{2,1},{3,0}};
		int arr2[][]= {{4,1},{9,2}};
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
			System.out.print(arr[i][j]+arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
}
