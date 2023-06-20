package com.assignments3;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		num=sc.nextInt();
		int count=0;
		// prime no is no which is not divided by any digit
		// checking condition 
		for(int i=1; i<=num; i++)
		{
		// calculate rem of that num i.e num/i and if rem will be 0 then exicutes if parts
			if (num%i==0)
			{
	   // if above condition is true then increment counter by 1
				count++;
			}		
		}
		// cheking 2nd condition if counter ==2 then true gets exicutes
		if (count==2)
			System.out.println("the number is prime number");
		else 
			System.out.println("the number is not a prime number");

	}

}
