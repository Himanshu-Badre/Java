package Array_2D;

import java.util.Scanner;

public class Matrix_Mul {
		public static void main(String[] args) {
			int a[][],b[][],c[][],i,j,k;
			a=new int [3][3];
			b=new int [3][3];
			c=new int [3][3];
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number For 1st Matrix");
			for(i=0;i<3;i++) {
				for(j=0;j<3;j++) {
					a[i][j]=sc.nextInt();
					}
			}
			System.out.println("Enter Number For 2nd Matrix");
			for(i=0;i<3;i++) {
				for(j=0;j<3;j++) {
					b[i][j]=sc.nextInt();
					}
			}
			for(i=0;i<3;i++) {
				for(j=0;j<3;j++) {
					c[i][j]=0;
					for(k=0;k<3;k++) {
						c[i][j]= c[i][j] + a[i][k] * b[k][j];
					}
				}
			}
			System.out.println("Result Of Multiplication : ");
			for(i=0;i<3;i++) {
				for(j=0;j<3;j++) {
					System.out.print(c[i][j] +"\t");
				}
				System.out.println();
			}
		}
}
