package com.demo;

public class operators {

	public static void main(String[] args) {
		int a = 5;
		// we want modify the value of a = 10 , use modified assignment
		a +=5;
		System.out.println(a);
		
		{
		// relational operators
		int a1=20, b1=10, c1=2;
		int ans = (a1+b1)/c1;
		
		// we want ans in boolean form that is true or false
		boolean ans1 = ans>10;
		System.out.println(ans);
		System.out.println(ans1);
		}
		
		{
		//logical operators
		int age = 24;
		char citizen= 'P';
		boolean result= (age>18)&&(citizen=='P');
		System.out.println("Decision to open account:"+result);
		// && operator is work when both condition is true
		}
		
		{
			//unary operators
			//++a = preincrement, ++a post increment
			int x=10;
			x++;
			System.out.println("Value of x:"+x);
			
			int x1=10;
			int y1 = ++x;
			System.out.println("Value of y1:"+y1);
			System.out.println("Value of x1:"+x1);
			
			int x2=10;
			int y2= x++;
			System.out.println("Value of y2:"+y2);
			System.out.println("Value of x2:"+x2);
		}
	}

}
