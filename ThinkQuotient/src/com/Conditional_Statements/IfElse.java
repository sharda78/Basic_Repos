package com.Conditional_Statements;
import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		if(num % 3 == 0 && num % 5 == 0)
		{
			System.out.println("Welcome");
		} else if(num % 3 == 0)
		{
			System.out.println("Hii");
		}
		else if(num % 5 == 0)
		{
			System.out.println("Hello");
		}
		else
		{
			System.out.println("Invalid");
		}
		sc.close();
		
	}

}
