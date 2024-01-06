package Collection_Framework;
//wap to remove duplicate elements fom give  list
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(12,13,15,15,1,2,12,13,14);
		Set<Integer>set=new HashSet();
		set.addAll(list);
		System.out.println(set);
	}
}
