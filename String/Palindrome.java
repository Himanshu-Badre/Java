package String;
//wap to check the given string is palindrome or not
// mom
public class Palindrome {

		public static void main(String[] args) {
			String str="Welocme";
			String rev= "";
			for(int i=str.length()-1;i>=0;i--) {
				rev=rev+str.charAt(i);
			}
			if(str.equalsIgnoreCase(rev)) {
				System.out.println(str+" Is Palindrome");
			}else {
				System.out.println(str+" Is Not Palindrome");
			}
		}
}
