package String;
//wap to reverse the words from a string 
// for ex String str="Welcome To Java";
// Str="emoclew ot vaja";

public class RevWords {
		public static void main(String[] args) {
			String str="Welcome To Java";
			String str1[]=str.split(" ");
			for(int i=0;i<str1.length;i++ ) {
			String temp=str1[i];
				for(int j=temp.length()-1;j>=0;j--) {
				System.out.print(temp.charAt(j));
				}
			System.out.print(" ");
			}
		}
}
