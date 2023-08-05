package com.Assignments;
import java.util.*;
public class MagicNumber {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		
		for(int i =1 ;i<=5; i++)
		{
			System.out.println("Enter Number");
			int num = sc.nextInt();
			if (num == 1)
			{
				System.out.println("Please Enter Correct Number");
			
			}
			else if(num == 2)
			{
				System.out.println("Please Enter Correct Numnber");
				
			}
			else if(num == 3)
			{
				System.out.println("Please Enter Correct Numnber");
			
			}
			else if(num == 4)
			{
				System.out.println("You choose correct ");
				
			}else {
				System.out.println("Invalid");
			}
		}
		sc.close();
		
		}

}
