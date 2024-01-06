package Collection_Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//wap to store a length of each city name in sorted order
public class CityName {
	public static void main(String[] args) {
		List<String> list=Arrays.asList(
				"Nagpur","Mumbai","Pune","Delhi","Bangalore");
		List<Integer> list1=new	ArrayList<>();
		for(String a:list) {
		int length=a.length();
		list1.add(length);
		}
		//list1.sort(null);
		Collections.sort(list1);
		System.out.println(list1);
	}
}
