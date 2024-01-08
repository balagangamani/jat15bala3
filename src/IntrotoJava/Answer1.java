package IntrotoJava;

import java.util.Scanner;

public class Answer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value for a: "); // Give value for a 
		int a = sc.nextInt();
		
		System.out.println("Enter value for b: "); // Give value for b
		int b = sc.nextInt();
		
		System.out.println("Enter value for c: "); // Give value for c 
		int c = sc.nextInt();
		
		System.out.println("Enter value for d: "); // Give value for d 
		int d = sc.nextInt();
		
		// Check if the sum of a and b is greater than the sum of c and d by giving values 

		if((a + b) > (c + d)) {
			
			System.out.println("The sum of a and b is greater than the sum of c and d");
		}
			
		//if the sum of a and b is greater than c and d then below statement is displayed along with above one
		//if the sum of a and b is not greater than c and d then below statement is displayed directly

		    System.out.println("End of code");
		    
		    	
			}

}
