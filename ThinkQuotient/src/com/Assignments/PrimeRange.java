package com.Assignments;

public class PrimeRange {

	public static void main(String[] args) {
		System.out.println("Prime Number Between Range 1 to 20 :");
		for(int i=1; i<=20; i++)
		{
			if(i % 2 == 0)
			{
				continue;
			}
		System.out.println(i);
		}
		
	}

}
