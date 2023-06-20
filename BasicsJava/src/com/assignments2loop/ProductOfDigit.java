package com.assignments2loop;

import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) {
		int n ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		n=sc.nextInt();
		int p=1;
		while(n>0)
		{
			int rem;
			rem=n%10;
			p=p*rem;
		    n++;
            n=n/10;
		}
          System.out.println(p);
		
	}

}
