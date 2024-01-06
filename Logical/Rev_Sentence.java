package Logical;

public class Rev_Sentence {
	public static void main(String[] args) {
		String s="Himanshu Is Smart";
		String [] split=s.split(" ");
		for(int i=split.length-1;i>=0;i--) {
			System.out.print(split[i]+ " ");
		}
	}
}
