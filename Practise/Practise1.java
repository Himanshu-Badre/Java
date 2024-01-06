package Practise;

//Area of triangle= 0.5*length*width
//Area of Circle= 3.14 * Square(Rad)
//Area of Square= Square(length)
//Area of Rectangle= length* width

public class Practise1 {
	void Area() {
		//For Triangle
		float a=0.5f;
		int length=5,width=7;
		float triangle=a*length*width;
		System.out.println("Area Of Triangle : "+triangle);
	}
	int area(double a) {
		// circle
		a=3.14;
		int rad=5;
		int Square=rad*rad;
		int Circle=a*Square;
		return Circle ;
	}
}
