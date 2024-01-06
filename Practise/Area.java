package Practise;

/*
 * OOps
		WAP- Area of Circle and Triangle by using method overloading.
		
		Area of circle= pi * square(redius)
		Area of Triangle= 0.5* Length* Hight*/

public class Area {
	void areaOf() {
		double pi=3.14;
		int rad=7,sqr=5;
		System.out.println("Result="+pi*sqr*rad);
	}
	int areaOf(int l,int h) {
		return l*h;
	}
	public static void main(String[] args) {
		
		Area A1=new Area();
		A1.areaOf();
	System.out.println(A1.areaOf(5, 7));	
		
	}
}
