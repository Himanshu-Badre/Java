package Practise;

import java.util.ArrayList;

public class p1 {
	 public static void main(String[] args) {
	        int startRange = 2;
	        int endRange = 100;

	        ArrayList<Integer> primeNumbers = new ArrayList<>();

	        for (int num = startRange; num <= endRange; num++) {
	            if (isPrime(num)) {
	                primeNumbers.add(num);
	            }
	        }

	        System.out.println("Prime numbers between " + startRange + " and " + endRange + ":");
	        System.out.println(primeNumbers);
	    }

	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
}
