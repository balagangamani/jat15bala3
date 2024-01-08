package IntrotoJava;

import java.util.Scanner;

public class Answer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter an integer: "); //Give one/more values
        int number = sc.nextInt();

        int digitCount = countDigits(number);

        System.out.println("The number of digits in " + number + " is: " + digitCount);
    }

    private static int countDigits(int number) {
        int count = 0;

        while (number != 0) {
        number /= 10;  // This will remove the last digit from number
        count++;       // Increases the count of digits
        }

        return count;
	}

}
