package com.demo;

import java.util.Scanner;

public class GradesofSub {

	public static void main(String[] args) {
		int sub1, sub2, sub3, sub4, sub5;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sub1,Sub2,Sub3,Sub4 and Sub5");
		sub1=sc.nextInt();
		sub2=sc.nextInt();
		sub3=sc.nextInt();
		sub4=sc.nextInt();
		sub5=sc.nextInt();
		
		int total=(sub1+sub2+sub3+sub4+sub5);
		int per=(total/5);
		System.out.println("Percenatge is:"+per);
		
		if (per>90)
		{
			System.out.println(" having grade A+");
			
		}
		else if (per>=80)
		{
			System.out.println(" having grade A");
			
		}
		else if (per>=70)
		{ 
			System.out.println(" having grade B+");
		
		}
	
	}

}
