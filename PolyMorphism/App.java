package PolyMorphism;

//RUN_TIME-POLYMORPHISM
//(DATA OVERRIDING)(DYNAMIC METHOD DISPATCH)

class RBI{
	float getROI() {
		return 6.7f;
	}
}
class SBI extends RBI{
	float getROI() {
		return 4.5f;
	}
}
public class App {
public static void main(String[] args) {
	RBI R1=new SBI();
	System.out.println(R1.getROI());
}
}
