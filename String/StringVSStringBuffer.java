package String;

public class StringVSStringBuffer {
	public static void main(String[] args) {
		String s1=new String("Hey");
		s1.concat(" Sam");
		System.out.println(s1);
		
		StringBuffer s2=new StringBuffer("Hey");
		s2.append(" Sam");
		System.out.println(s2);
	}
}
