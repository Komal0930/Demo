package com.assignments3;

import java.util.Scanner;

public class SumofGivenNo {

	public static void main(String[] args) {
		int num;
		int rem;
		int totalsum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No");
		num=sc.nextInt();
		while (num>0)
		{

			// % it gives reaminder its last digit suppose no is 1234 then rem is 4
		    rem=num%10;
  // here totalsum is 0 as per initialization and rem is 4 i.e 0+4=4
		    
			totalsum=totalsum+rem;
	// again no get divided by 10 and rem will be 3 now again it check condition from while
			num=num/10;
		}
			System.out.println("The sum of Given no is:"+totalsum);	
			
		}
      
      
	}


