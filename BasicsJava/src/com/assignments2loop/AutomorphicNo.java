package com.assignments2loop;

import java.util.Scanner;

public class AutomorphicNo {

	public static void main(String[] args) {
		int i, n, sq,  c=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Num");
		n=sc.nextInt();
		// calculate square of entered no 
		sq=n*n;
		// checking condition 
		for ( i=n; n>0; n=n/10)
		{
			// check rem of n is equal to rem of sq
			if (n%10==sq%10);
			// increment counter by 1
			c++;
			// again sq is divided by 10 till rem becomes 0
			sq=sq/10;
		
		}
		if (c>0)
			System.out.print("The number is Automorphic");
		else
			System.out.println("The number is Not Automorphic");
		
		

	}

}
