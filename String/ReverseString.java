package String;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String obj = "Shubhangi"+ "";
		String ob = obj.replace(" ","");
		for(int i = ob.length()-1; i>=0 ; i--) {
			
			System.out.print(ob.charAt(i));
		}
		
		
	}

	
}
