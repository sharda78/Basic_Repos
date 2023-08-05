package com.KhadijaMamAssignments;

import java.util.Scanner;

public class KrishnaMurthyNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int num,digit,sum=0,temp;
		System.out.println("Enter number: ");
		num = sc.nextInt();
		temp = num;
	while(num > 0)
	{
		digit = num % 10;
		int fact =1;
			for(int  i = 1; i<= digit;i++)
			{
				fact = fact * i;
				
			}
			sum = sum + fact;
		num /= 10;
	}
	System.out.println("sum is: " + sum);
	num = temp;
	if(num == sum)
	{
		System.out.println(num + " is krishnaMurthy number");
	}
	else
	{
		System.out.println(num + " is not krishnamurthy  number");
	}
	sc.close();

}
}
