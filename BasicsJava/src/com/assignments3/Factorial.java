package com.assignments3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num;
		// taking input from user
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		// Initialize fact =1
		int fact=1;
		// checking condition for loop
		for (int i=1;i<=num;i++)
		{
			// factorial = 1*i 
			// i will continuosly increase by 1 until the enterd no
			fact=fact*i;
			
		}
			
		System.out.println("The factorial of given No is:"+fact);

	}

}
