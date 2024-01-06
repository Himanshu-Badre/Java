package Wrapper_Class;
/*
 * the automatic conversion of wrapper class 
 * into its corresponding  primitive data type
 * is called unboxing.*/
public class UnBoxing {
public static void main(String[] args) {
	Integer a=20;
	int b=a.intValue();//unboxing
	int c=a;//since 1.5 version
	System.out.println(c);
 }
}
