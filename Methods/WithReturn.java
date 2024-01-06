package Methods;

public class WithReturn {
	//with arguments with return method;
int add(int a,int b, int c) {
	return a+b+c;// it will return addition of 3
	}
public static void main(String[] args) {
	WithReturn WR =new WithReturn();
	System.out.println(WR.add(10, 20, 30));//it will call method before printing
    }
}
