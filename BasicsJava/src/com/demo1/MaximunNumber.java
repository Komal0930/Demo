package com.demo1;

import java.util.Scanner;

public class MaximunNumber {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number a,b and c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
	// comparing a with b and c if both condition is true then print 
		if (a>b && a>c)
		{
		System.out.println(a +"is maximum no");
		}	
		// comparing b with a and c 
		else if (b>a && b>c)
		{
			System.out.println(b +" is maximum no");
		}
		// comparing c with a and b 
		else if (c>a && c>b)
		{
			System.out.println(c +"is maximum no");
		}

	}

}
