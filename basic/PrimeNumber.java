package basic;

public class PrimeNumber {
	public static void main(String args[]) {
		int no=9;	//local variable
		boolean isPrime=true;
		for(int i=2;i<=no/2;i++){
			if(no%i==0) {
			isPrime=false;
			break;
			}
		}
		if(isPrime) {
			System.out.println(no+" Is Prime");
		}
		else {
			System.out.println(no+" Is Not Prime");
		}
	}
}
