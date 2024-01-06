package basic;

public class PrePost {
public static void main(String[] args) {
	int a=10,b=60;
	a=b--;
	a=++a;
	b=++a;
	a=b--;
	b=a;
	System.out.println(a);
	System.out.println(b);
}
}
