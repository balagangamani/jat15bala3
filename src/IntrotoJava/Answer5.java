package IntrotoJava;

import java.util.Scanner;

public class Answer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
    	System.out.println("Enter a number: "); //Give a value
    	int number = sc.nextInt();
    	
    	if (isPrime(number)) {

           // if the number is prime then the below statement is displayed
    		
	    	System.out.println(number + " is a prime number");
    	}
		
    	else {
    			    	
            // if the number is not a prime then the below statement is displayed
	    	
    		System.out.println(number + " is not a prime number");
    		
    	}
    		
    	}
      
    	public static boolean isPrime(int number) {
    		

		if (number <= 1) {
			
			return false;

		}
        
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				
			return false;	
			
			}
		}
		    return true;
			
	}
}
