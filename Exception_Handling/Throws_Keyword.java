package Exception_Handling;

import java.io.IOException;
import java.util.Scanner;

public class Throws_Keyword {
static void validateVoter(int age) throws IOException {
		
		if(age<18) {
			throw new IOException("You are not eligible to cast your vote");
		}else {
			System.out.println("Welcome to Voting system");
		}	
	}
	public static void main(String[] args) throws IOException{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your age");
	int age = sc.nextInt();
	
	validateVoter(age);

	}
}
