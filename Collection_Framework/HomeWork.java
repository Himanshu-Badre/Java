package Collection_Framework;
//wap to remove the duplicate elements from given list
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HomeWork {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(30);
		list.add(30);
		list.add(40);
		list.add(40);
		list.add(50);
		list.add(50);
		list.add(60);
		list.add(10);
		System.out.println("BEfore List : "+list);
		List<Integer> list1 =new ArrayList<>();
		for(Integer a: list) {
			if(!list1.contains(a)) {
			list1.add(a);
		}
	}
	
		System.out.println("After List: "+list1);
//		Set<Integer> set = new HashSet<>(list);
//		System.out.println("After List : "+set);
		
	}
}
