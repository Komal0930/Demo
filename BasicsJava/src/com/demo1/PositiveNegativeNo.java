package com.demo1;

import java.util.Scanner;

public class PositiveNegativeNo {

	public static void main(String[] args) {
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num1");
		num1=sc.nextInt();
		
		if (num1>0)
		{
			System.out.println("The No is positive");
		}
		else if (num1<0)
		{
			System.out.println("The No is negative");
		}
		else if (num1==0)
		{
			System.out.println("the No is 0");
		}
	}

}
