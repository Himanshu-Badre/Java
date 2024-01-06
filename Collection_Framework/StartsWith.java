package Collection_Framework;
//wap to print the city names which starts from "p";
import java.util.Arrays;
import java.util.List;

public class StartsWith {
	public static void main(String[] args) {
		List<String> list=Arrays.asList(
				"Mumbai","Pune","Solapur","Nashik","Nagpur"
				);
		for(String a: list) {
			if(a.startsWith("P")) {
				System.out.println(a);
			}
		}
	}
}
