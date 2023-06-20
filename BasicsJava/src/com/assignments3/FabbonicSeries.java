package com.assignments3;

import java.util.Scanner;

public class FabbonicSeries {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		int i;
		int firstno=0;
		int secondno=1;
		int nextno;
		
		for (i=0;i<=n;i++)
		{
		nextno=firstno+secondno;
		firstno=secondno;
		secondno=nextno;
	   
		System.out.println(nextno);
		}
					

	}

}
