package Exception_Handling;
import java.io.IOException;

public class Propagation {
	void A()throws IOException {
		int a=10;
		int b=0;
		//int c=a/b;// throws arithmetic exception
		throw new IOException();
	}
	void B()throws IOException {
		A() ;
		System.out.println("Method B");
	}
	void c()throws IOException {
		B();
		System.out.println("Method C");
	}
	public static void main(String[] args)throws IOException {
		Propagation P1=new Propagation();
		try {
			P1.c();	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception Handled");
		}
	}
}

