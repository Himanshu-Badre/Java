package Constructor_Calling;

class A {
	A() {
		System.out.println("A");
	}
}
class B extends A {
	B() {
		System.out.println("B");
	}
	B(String name){
		this();
		System.out.println(name);
	}
}
class C extends B {
	C() {
		System.out.println("C");
	}
	C(String a){
		super(a);//by default every constructor has super keyword
		System.out.println(a);
	}
}

public class Test {
	public static void main(String args[]) {
		C c1 = new C("C");

	}

}