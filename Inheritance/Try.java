package Inheritance;

abstract class Method2{
	
	 static int i;
	
	Method2(){
		i=25;
	}	
	
}
class Test{
	static String s = "java";  
}

public class Try extends Test{

	
	public static void main(String[] args) {
//		Method2 a = new Try();
		int i = Test.s.length();
		System.out.println(i);
	}
}
