package String;
//wap to print the vowels from given string
//String="Welocme To Java World";
public class Vowels {
	public static void main(String[] args) {
		String str="Welcome To Java World";
		
	        for (int i = 0; i < str.length(); i++) {
	          if (str.charAt(i) == 'a' || str.charAt(i) == 'e' 
	        		  || str.charAt(i) == 'i' || str.charAt(i) == 'o' 
	        		  || str.charAt(i) == 'u'
	        		  || str.charAt(i) == 'A' || str.charAt(i) == 'E' 
	        		  || str.charAt(i) == 'I' || str.charAt(i) == 'O' 
	        		  || str.charAt(i) == 'U') {
	                System.out.println("Found vowel " + str.charAt(i));
	            }
	        }
		}
	}
