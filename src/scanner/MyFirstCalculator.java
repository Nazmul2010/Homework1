package scanner;

import java.util.Scanner;

public class MyFirstCalculator {
	

		public static void calculator(){
		    System.out.println("Welcome to my calculator! ");
		    System.out.println("Please enter the first number");
		    Scanner sc = new Scanner(System.in);
		    int firstNumber = sc.nextInt();
		    System.out.println("Great! now enter the second number");
		    int secondNumber = sc.nextInt();
		    int additionOfTwoNumber = firstNumber + secondNumber;
		    int subtractionOfTwoNumber = firstNumber - secondNumber;
		    int multiplicationOfTwoNumber = firstNumber * secondNumber;
		    int divisionOfTwoNumber = firstNumber / secondNumber;
		    System.out.println("addition of two number is " + additionOfTwoNumber);
		    System.out.println("subtraction of two number is " + subtractionOfTwoNumber);
		    System.out.println("multiplication of two number is " + multiplicationOfTwoNumber);
		    System.out.println("division of two number is " + divisionOfTwoNumber);
		    System.out.println("Thank you for using my calculator!");
		    sc.close();
		}

	public static void main(String[] args) {
		MyFirstCalculator.calculator();

	}

}
