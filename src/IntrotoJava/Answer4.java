package IntrotoJava;

import java.util.Scanner;

public class Answer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number: "); // Give value for first number
		int num1 = sc.nextInt();

			
		System.out.println("Enter the second number: "); // Give value for second number
		int num2 = sc.nextInt();
		
		System.out.println("original values: "); //original values displayed after entering values

		System.out.println("first number: " + num1);

		System.out.println("second number: " + num2);
		
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("swapped values: " + num2); //swapped values are displayed

		System.out.println("first number: " + num1);

		System.out.println("second number: " + num2);

	
	}

}
