package com.Assignments;

public class SumOfEvenNum {

	public static void main(String[] args) {
		int sum =0;
		for(int i = 1; i<=20; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println("\nSum of Even Number Upto 20: " + sum);

	}

}
