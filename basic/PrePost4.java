package basic;

public class PrePost4 {
public static void main(String[] args) {
	int a=100,b=20;
	a=b++;
	b=--b;
	b=++a;
	a=++a;
	a=--a;
	a=a--;
	b=a--;
	b=++a;
	System.out.println("a= "+ a--);
	System.out.println("b= "+b);
}
}
