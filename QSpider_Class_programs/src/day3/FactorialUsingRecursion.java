package day3;

public class FactorialUsingRecursion {

	    public static void main(String[] args) {
	        int n = 5; // Example: Calculate the factorial of 5
	        int factorial = calculateFactorial(n);
	        System.out.println("The factorial of " + n + " is: " + factorial);
	    }

	    public static int calculateFactorial(int n) {
	        // Base case: if n is 0 or 1, return 1
	        if (n <= 1) {
	            return 1;
	        }
	        // Recursive case: n * factorial of (n - 1)
	        return n * calculateFactorial(n - 1);
	    }
	}

