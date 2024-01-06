package Logical;

public class RevString {
		public static void main(String[] args) {
			String str="Himanshu";
			System.out.println("Before Reverse: "+str);
			System.out.print("After Reverse: ");
			for(int i=str.length()-1;i>=0;i--) {
				System.out.print(str.charAt(i));
			}
	
		}
}
