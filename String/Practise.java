package String;

public class Practise {
	 static public void main(String[] args) {
		 String country ="India";
		 
		 String str = "India is my country I love India I am Indian India is great  ";
		 
		 String words[]= str.split("\\s+");
		 
		 int count=0;
		 
		 for(int i=0;i<words.length;i++) {
			 
			 if(country.equalsIgnoreCase(words[i])) {
				 count++;
			 }
		 }
		 System.out.println(count);
				 		 
		 
	}
}
