package com.demo1;

import java.util.Scanner;

public class AlphabetDigitSpecial {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any character");
		ch=sc.next().charAt(0);
		
		if (ch>='A'&& ch<='Z')
		{
			System.out.println("The No is alphabet between A to Z");
		}
		else if (ch>='a' && ch<='z')
		{
			System.out.println("The  is alphabet between a to z");
			
		}
		else if (ch>='0'&& ch <='9')
		{
			System.out.println("The Char is digit");
			
		}
		
		else
		{
			System.out.println("The No is special Character");
			
		}
	}

}
