package IntrotoJava;

import java.util.Scanner;

public class Answer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

	    System.out.print("Enter a number to find its factorial: "); //Enter a number
	    int number = sc.nextInt();

	    long factorial = factorial(number);

	    System.out.println("The factorial of " + number + " is: " + factorial);
	   
	}

	 private static long factorial(int number) {
	        
		 long result = 1;

	     for (int factor = 2; factor <= number; factor++) {
	            
	    	 result *= factor;
	       
	     }

	        return result;
	}

}
