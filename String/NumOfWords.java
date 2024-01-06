package String;
//wap to find the number of words in java
public class NumOfWords {
	
	public static void main(String[] args) {
		String str="India Is my Country i love india i am indian india is great";
		String str1[]=str.split(" ");
		System.out.println("Number Of Words "+str1.length);
	}
}
