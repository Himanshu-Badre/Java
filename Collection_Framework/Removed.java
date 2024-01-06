package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//wap to remove all odd numbers from array list
public class Removed {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(); 
		list.add(20);
		list.add(45);
		list.add(78);
		list.add(25);
		list.add(21);
		list.add(10);
		list.add(12);
		System.out.println("List Before Removed: "+list);
		Iterator<Integer> itr= list.iterator();
		while(itr.hasNext()) {
			Integer a=itr.next();
			if(a%2==0) {
				itr.remove();
			}
		}
		System.out.println("List After Remove"+list);
	}
}
