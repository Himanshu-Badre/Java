package Collection_Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unsupported {
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(12,34,15,78);
		list.remove(2);
		System.out.println("List: "+list);
	}
}
