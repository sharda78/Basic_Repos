package com.Assignments;
import java.util.Scanner;
public class IncreasingNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int copy = num;
		int d,d1;
		
		while(num > 0)
		{
			 d = num % 10;
			num /= 10;
			 d1 = num % 10;
		
		if(d > d1)
		{
			System.out.println("increasing Number: " + copy);
			break;
		}
		else
		{
			System.out.println("Not Increasing Numner");
			break;
		}
		}
		}

	}


