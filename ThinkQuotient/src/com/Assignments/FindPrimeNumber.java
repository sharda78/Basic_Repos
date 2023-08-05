package com.Assignments;

import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt(); 
		
		while(num > 0)
		{
			int digit = num % 10;
		
			if(digit % 2 == 1)
			{
				System.out.println(digit);
			}
			
		num /= 10;
		
		}	
		sc.close();
		

	}

}
