package Collection_Framework;
//wap to print odd numbers from array list
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		list.add(20);
		list.add(45);
		list.add(50);
		list.add(75);
		list.add(24);
		list.add(45);
		list.add(85);
		list.add(12);
		list.add(30);
		list.add(20);
		list.add(20);
		for(Integer a: list) {
			if(a%2==0) {
				System.out.println(a);
			}
		}
		System.out.println(list.size());
	}
}
