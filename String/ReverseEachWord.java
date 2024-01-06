package String;

public class ReverseEachWord {
	
	 public static String reverseString(String a) {
		String reverseWord = "";
		for(int i = a.length()-1; i>=0; i--) {
			reverseWord = reverseWord + a.charAt(i);
		}
		return reverseWord;
	
}
	public static void main(String[] args) {
	
		String given = "Welcome To java World";
		
		String word [] = given.split(" ");
		String reverse = "";
		for(String words : word) {
			
			reverse = reverse + reverseString(words) + " ";
		}
		
          System.out.println(reverse);
}
}