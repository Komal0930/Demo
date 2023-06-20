package com.assignments2loop;

import java.util.Scanner;

public class FacorialNo {

	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the num");
		n= sc.nextInt();
		int temp=n;
		int sum=0;
		int rem;
		while (n>0)
		{
			rem=n%10;
			int i ;
			int fact=1;
			for ( i=1; i<=rem;i++)
			{
				fact=fact*i;
				
			}
			sum=sum+fact;
			n=n/10;
			
		}
      if ( temp==sum)
      
    	  System.out.println("krushnamurthy");
      
      else
      System.out.println("Not krushnamurthy");
      }
    	  
    	  
	}


