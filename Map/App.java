package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class App {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<>();
	map.put(101, "Smith");
	map.put(102, "Himanshu");
	map.put(103, "Sampada");
	map.put(104, "Shubhangi");
	map.put(105, "Sumit");
	map.put(106, "Akshay");
	map.put(107, "John");
	map.put(108, "Unknown");
	Set<Map.Entry<Integer, String>>entryset=map.entrySet();
	for(Map.Entry<Integer, String> entry:entryset) {
		System.out.println("Key= "+entry.getKey()+" Value= "+entry.getValue());
	}
}
}
