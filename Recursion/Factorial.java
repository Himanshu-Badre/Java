package Recursion;
//Wap to find the factorial of given number using recursion 
public class Factorial {
	static int getFact(int num) {
		if(num==0) {
			return 1;
		}
		return num*getFact(num-1);
	}
	public static void main(String[] args) {
		System.out.println(getFact(5));
	}
}
