package basic;

public class PrePost3 {
public static void main(String[] args) {
	int a=100,b=20;
	a=a++; //a=100, b=20;
	b=++b; //a=100, b=21;
	a=a++; //a=100, b=21;
	b=++b; //a=100, b=22;
	b=--b; //a=100, b=21;
	b=++a; //a=101, b=101
	a=a--; //a=101, b=101;
	System.out.println("a= "+ ++b);
	System.out.println("b= "+ ++a);
}
}
