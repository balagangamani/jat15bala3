package IntrotoJava;

import java.util.Scanner;

public class Answer9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age: "); //Enter age here
        int age = sc.nextInt();

        if (age >= 65) {
           
        	System.out.println("You are a senior citizen.");
        
        } 
        
        else {
            
        	System.out.println("You are not a senior citizen.");
	
        }
	}
	

}
