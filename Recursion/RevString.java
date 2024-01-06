package Recursion;
// wap to reverse the string using recursion
public class RevString {
	static String getRev(String str) {
		if(str.isEmpty()) {
			return str;
		}
		return getRev(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
		System.out.println(getRev("Java"));
	}
}
