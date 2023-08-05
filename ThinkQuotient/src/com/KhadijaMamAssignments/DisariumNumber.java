package com.KhadijaMamAssignments;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		int cnt = 0,sum =0,temp;
		temp=num;
		while(num > 0)
		{
			cnt++;
			num /= 10;
		}
		System.out.println("No of digits is: " + cnt);
		num = temp;
		while(num != 0)
		{
			int digit = num % 10;
			sum += Math.pow(digit, cnt);
			cnt--;
			num /= 10;
		}
		
		if (sum == temp)
            System.out.println("Disarium Number");
        else
            System.out.println("Not a Disarium Number");


	}

}
