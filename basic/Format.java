package basic;

public class Format {
	public static void main(String args[]) {
		for(int i=1;i<=20;i++) {
			if(i%3==0 && i%5==0) {
			System.out.println("Pendrive");	
			}
			else if(i%3==0) {
				System.out.println("SSD");
			}
			else if(i%5==0) {
				System.out.println("HDD");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
