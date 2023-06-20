package com.assignments3;

import java.util.Scanner;

public class MaximunOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No");
		num=sc.nextInt();
		int highestdigit=1;
	
		while (num>0)
		{
		 int  digit= num%10;
			
			if (digit>highestdigit)
				{
					highestdigit=digit;
				}
				
				num=num/10;		
		}
		System.out.println("Highest No is:"+highestdigit);
		

	}

}
