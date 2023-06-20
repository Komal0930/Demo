package com.assignments2loop;

import java.util.Scanner;

public class SumofEvenNo {

	public static void main(String[] args) {
		int n;
		int sum=0;
		// take input from user
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
	// for loop intiliazing condition testing , statement and incremetation
		
		for (int i=0; i<=n ;i++)
			// if rem of i will be 0 then true condition will exicutes
		
			if (i%2==0)	
			// sum=0+new value of i
			 sum = sum+i;
			{
			
			System.out.println("The sum of all even numbers between 1 to "+n+"is"+sum);
			}
		

	}
	

}
