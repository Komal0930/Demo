package com.demo1;
import java.util.Scanner;

public class VowelsConstant {

	public static void main(String[] args) {
	 char ch ;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter any Alphabets");
	 ch = sc.next().charAt(0);
	 if (ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	 {
		 System.out.println(ch+ "is a vowels");
	 }
	 else
	 {
		 System.out.println(ch+ "is a constant");
		 
	 }

	}

	private static void next() {
		// TODO Auto-generated method stub
		
	}

}
