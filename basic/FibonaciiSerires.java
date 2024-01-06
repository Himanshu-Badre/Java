package basic;
/* WAP to print fibonacii series 
 * Fn = Fn-1 + Fn-2, where n > 1
 * */
public class FibonaciiSerires {
	public static void main(String args[]) {
		int n1=0;
		int n2=1;
		int sum=0;
		for(int i=1;i<=5;i++)
		{
			System.out.println("Fibonacii Series Is :"+n1);
			sum=n1+n2;
			n1=n2;
			n2=sum;
/*			System.out.println("Fibonacii Series Is :"+n1);
			it will print from 1 not from 0; 
*/
		}
	}
}
