package Collection_Framework;
//wap to convert list of string into integer
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntoStr {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("12","13","14","15");
		List<Integer> intlist=new ArrayList();
		Integer no=0;
		for(String str:list) {
			no=Integer.parseInt(str);
			intlist.add(no);
		}
		System.out.println(list);
	}
}
