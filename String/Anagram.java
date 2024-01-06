package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String.....!");
		String i = sc.next();
		String j = sc.next();

		i = i.toLowerCase();
		j = j.toLowerCase();
		char[] a=i.toCharArray();
		char[] b=j.toCharArray();
		boolean isTrue = false;

		if (a.length == b.length) {
			 Arrays.sort(a);
			 Arrays.sort(b);
			 System.out.println(Arrays.toString(a)+"   "+Arrays.toString(b));
			isTrue = Arrays.equals(a, b);
			if(isTrue){
				System.out.println("String is anagram");
			}
			else {
				System.out.println("String is not anagram");
			}
		}else {
			System.out.println("String is not anagram");
		}
	}
}
