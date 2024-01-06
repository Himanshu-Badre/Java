package Collection_Framework;
//wap to make addition of squares of each array elements
import java.util.Arrays;
import java.util.List;

public class AddSquare {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,4,3,5,1,2);
		int sum=0;
		for(Integer a:list) {
			sum=sum+(a*a);
		}
		System.out.println(sum);
	}
}
