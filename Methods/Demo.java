package Methods;

public class Demo {
void Prime(int No) {
	boolean isPrime=true;
	for(int i=2;i<=No/2;i++) {
		if(No%i==0) {
			isPrime=false;
			break;
		}
		if(isPrime) {
			System.out.println(No+" Is Prime");
		}
		else {
			System.out.println(No+" Is Not Prime");
		}
	}}
}
