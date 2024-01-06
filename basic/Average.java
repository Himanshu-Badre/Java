package basic;

public class Average {
	public static void main(String args[]) {
		int Sum=0;
		int avg=0;
		for(int i=1;i<=5;i++) {
			 Sum=Sum+i;
			 avg=Sum/i;
		}
		System.out.println("Average Of 1 To 5 Is  "+avg);
	}

}
