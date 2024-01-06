package basic;

import java.util.Scanner;

public class Perfect {
public static void main(String[] args) {
	int no,sum=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("Please Enter A Number ");
	no=sc.nextInt();
	for(int i=1;i<=no/2;i++) {
		if(no%i==0) {
			sum=sum+i;
		}
	}
	if(sum==no) {
	System.out.println(no+" Is Perfect number");
	}else {
		System.out.println(no+" Is Not Perfect Number");
	}
 }
}
// 6 Is Perfect Number
                      