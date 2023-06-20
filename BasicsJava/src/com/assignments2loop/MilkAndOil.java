package com.assignments2loop;

import java.util.Scanner;

public class MilkAndOil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		int o;
		int totalsum = 0;
		Scanner sc=new Scanner(System.in);
	while (totalsum<=500) 
		{
		//take unit from user if we take input before while it will give wrong input upto 500
		System.out.println("Enter the quantity of milk");
		System.out.println("Enter the quantity of oil");
	     m=sc.nextInt();
	     o=sc.nextInt();
	     // calculate sum of unit enter by user
		int  sum = (m*40)+(o*50);
		//calculate total sum of total units enter by user
		totalsum=totalsum+sum;
		
		}
	//print the statement
		System.out.println("Sum is :"+totalsum);
			
		
			
		
		
	}


}
