package Practise;
//wap for fibonacii series
public class Fibonacii {
	public static void main(String[] args) {
		int num=0;
		int num1=1;
		int sum=0;
			for(int i=0;i<10;i++) {
				System.out.println(num);
				sum=num+num1;
				num=num1;
				num1=sum;
			}
	}
}
