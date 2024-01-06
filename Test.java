
public class Test {

	
		public static boolean checkpanagram(String str1) {
			
			boolean[] mark = new boolean[26];
			
			int index = 0;
			
			for(int i = 0; i <str1.length(); i++) {
				if ('A' <=str1.charAt(i) && str1.charAt(i) <= 'Z') {
					index = str1.charAt(i) - 'A';
					
				}else if('a' <= str1.charAt(i) && str1.charAt(i) <= 'z') {
					index = str1.charAt(i) - 'a';
				}else {
					continue;
					/* mark[index] = true; */
				
				}
			}
			for(int i =0 ; i<=25 ; i++) {
				if(mark[i] == false) {
					
				}
			}
			return (true);
		}
			
			public static void main(String[] args) {
				String str ="Welcome";
				if(checkpanagram(str) == true ) {
					System.out.println(str ="given String is Panangram");
				}else {
					System.out.println(str + "Given String is Not Panagram");
				}
			
		
	}
}
