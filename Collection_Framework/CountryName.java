package Collection_Framework;
//wap to print country names whose size is greater than or equal to 5
import java.util.Arrays;
import java.util.List;

public class CountryName {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"Patna","Mumbai","Nagpur","aus","USA"
				);
		for(String a: list) {
			if(a.length()<=5) {
				System.out.println(a);
			}
		}
	}
}
