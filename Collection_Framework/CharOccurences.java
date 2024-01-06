package Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class CharOccurences {
	public static void main(String[] args) {
		String str="Technosignia Is Institute";
		HashMap<Character, Integer> hashmap=new HashMap<>();
		for(char c: str.toCharArray()) {
			if(hashmap.containsKey(c)) {
				hashmap.put(c, hashmap.get(c)+1);
			}else {
				hashmap.put(c, 1);
			}
		}
//		for(Character character:hashmap.keySet()) {
//			System.out.println(character+": "+hashmap.get(character));
//		}
		  for (Map.Entry entry : hashmap.entrySet()) {
	            System.out.println(entry.getKey()+ " " + entry.getValue());
	        }
	}
}
