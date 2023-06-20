package com.demo1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Year");
		year=sc.nextInt();
		
		if (year %400==0)
		{
			System.out.println("Specified year is a leap year");
			
		}
		else if (year%100==0)	
		{
			System.out.println("Specified year is not a leap year");
		}
		else if (year%4==0)
		{
			System.out.println("Specified year is a leap year");
		}
		else 
		{
			System.out.println("Specified year is not leap year");
		}
	}

}
