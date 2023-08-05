package com.Conditional_Statements;

import java.util.Scanner;

public class SwitchUsingCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Choose any operator + ,-, *, /, % ");
		String choise = sc.next();
		switch(choise)
		{
		case "+":
			int add = num1 + num2;
			System.out.println("Addition is: " + add);
			break;
		case "-":
			int sub = num1 - num2;
			System.out.println("Sbstraction is: " + sub);
			break;
		case "*":
			int mul = num1 * num2;
			System.out.println("Multiplication is: " + mul);
			break;
		case "/":
			int div = num1 / num2;
			System.out.println("Division is: " + div);
			break;
		case "%":
			int mod = num1 % num2;
			System.out.println("modulous is: " + mod);
			break;

		}
		sc.close();


	}

}
