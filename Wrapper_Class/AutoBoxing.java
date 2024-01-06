package Wrapper_Class;
/*
 * the automatic conversion of primitive data type
 *  into its corresponding wrapper class
 *  is called autoboxing.
 */
public class AutoBoxing {
	public static void main(String[] args) {
		int a=10;
		Integer b=Integer.valueOf(a);//AutoBoxing
		Integer c=a;//since 1.5 version
		System.out.println(a); 
	}
}
