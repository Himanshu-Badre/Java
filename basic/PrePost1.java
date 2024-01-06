package basic;

public class PrePost1 {
public static void main(String[] args) {
	int a=10,b=50;
	a=++b;
	a=++a;
	b=b++; /* No effect if we are using post-Increment or decrement &
	 		assigning to the same variable then
	 		 there is no effect of that perticular statement */
	System.out.println(a);
	System.out.println(b);
}
}
