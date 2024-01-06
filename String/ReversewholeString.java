package String;

public class ReversewholeString {
	
	public static void main(String[] args) {
		
		String oj = "Welcome To Java";
		String obj [] = oj.split(" ");
		
		for(int i =obj.length -1; i>=0; i--) {
			
			System.out.println(obj[i]);
			
		}
	}

}
