package com.assignments3;

import java.util.Scanner;
// 

public class ArmstrongNo {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		num=sc.nextInt();
		int temp=num;
		int length=0;
		 int sum=0;
		 // calculate length of number
		 while (temp>0)
		 {
			 
			 length=length+1;
			 temp=temp/10;
			 
		 }
         int temp2=num;
         while (temp2>0)
         {
        int mul=1;
         int rem =temp2%10;
         for (int i=1;i<=length;i++)
         {
        	 
        	 mul=mul*rem;
        	 
         }
         sum=sum+mul;
         temp2=temp2/10;
         }
         if (sum==num)
         {
         System.out.println("Armstrong");
         }
         else 
        	 System.out.println("not");
         
	}
}


