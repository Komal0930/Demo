package com.assignments3;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Any Number");
		num=sc.nextInt();
		int count=0;
		int luckyno=6;
		while (num>0)
		{
			int rem=num%10;
			
			if (rem==luckyno)
	
				count++;
			
			num=num/10;
			
		}
		System.out.println(count);
	}

}
