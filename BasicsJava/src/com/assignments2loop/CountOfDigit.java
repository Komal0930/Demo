package com.assignments2loop;

import java.util.Scanner;

public class CountOfDigit {

	public static void main(String[] args) {
		int count=0;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		num=sc.nextInt();
		while (num>0)
		{
		
		//int  rem = rem %10;
			count++;
			
			num=num/10;
		}
			
		
			
			System.out.println(count);
			
		
		}
			

	}


