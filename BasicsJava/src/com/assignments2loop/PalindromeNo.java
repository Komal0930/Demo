package com.assignments2loop;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		// declare variables n and temp
		int n;
		int temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		// store the number into temp to keep number safe
		temp=n;
		// declare reverse and remainder variable
		int rev=0;
		int rem;
		// check condition if temp is not equal to 0 then enter loop
		while (temp!=0)
		{
		// calculate rem temp i.e num/10 we get the last digit of n as a rem
			rem=temp%10;
			// calculate reverse by adding as we initialise rev is 0 (0*10)+rem 
			rev=(rev*10)+rem;
			// again temp value divided by 10 if it is graeter than 0 again loop will start that n
		    temp=temp/10;
			
		}
		// check condition if num = rev if true it exicutes true 
		if (n==rev)
		{
		System.out.println("Entered NO is palindorme");
		}
		
		else
		{
			System.out.println("Entered No is Non-Palindrome");
		}

	}

}
