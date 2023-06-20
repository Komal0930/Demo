package com.assignments2loop;

import java.util.Scanner;

public class SumOfOddNo {

	public static void main(String[] args) {
	    int n;
        int sum=0;
        Scanner sc =new Scanner (System.in);
		System.out.println("Enter the value of n");
	    n=sc.nextInt();
	    // no semicolun is used for for op
	   for (int i=1; i<=n ;i++)
	   
		 if (i%2!=0)	
					 sum =sum+i;
	   {
					System.out.println("The sum of all even numbers between 1 to "+n+"is"+sum);
					
	   }

			}

	


	}

