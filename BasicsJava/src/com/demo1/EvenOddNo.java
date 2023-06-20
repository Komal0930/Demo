package com.demo1;
import java.util.Scanner;
public class EvenOddNo {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the num");
		num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("The no is even");
		}
		else
		{
			System.out.println("The no is Odd");
			
		}

	}

}
