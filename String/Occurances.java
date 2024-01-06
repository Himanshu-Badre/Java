package String;
//wap to find the occurances of word india
public class Occurances {

		public static void main(String[] args) {
			String str="India Is my country i love india i am indian india is great";
		
			String str1[]=str.split(" ");//greedy space
			String str2="india";
			int count = 0;
			for(int i=0;i<str1.length;i++) {
				if(str2.equals(str1[i])) {
					count++;
					
				}
			}
			System.out.println("Word India Repeates : "+count);
			
		}
}
