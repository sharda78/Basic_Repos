package com.BasicPrograms;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int fact = 1 ,num;
		System.out.println("Enter number: ");
		num = sc.nextInt();
	
			for(int  i = 1; i<= num;i++)
			{
				fact = fact * i;
				
			}
		System.out.println("factorial is: " + fact);
		sc.close();

	}

}
