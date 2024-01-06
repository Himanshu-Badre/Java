package Constructor;
//this is ParaMeterized Constructor.
public class ParaConst {

	int rollno;
	String Name;
	ParaConst(int r, String N){
		this.rollno=r;
		this.Name=N;
	}
	public static void main(String[] args) {
		ParaConst p1=new ParaConst(101,"John");
		ParaConst p2=new ParaConst(102,"Smith");
		System.out.println("Roll No : "+p1.rollno+" Name: "+p1.Name);
		System.out.println("Roll No : "+p2.rollno+" Name: "+p2.Name);
	}
}
