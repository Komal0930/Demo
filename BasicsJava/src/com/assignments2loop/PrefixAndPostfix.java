package com.assignments2loop;

public class PrefixAndPostfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		a++; //postfix operator
		System.out.println(a);
		
		int a1=10;
		a1--;
		System.out.println(a1);
		
		int a2=10;
		// postfix operator hence in 1st term a2=10,after it increment by 1+ increment by 1 now a2=12
		// y2=10+11
		int y2=a2++ + a2++;
		System.out.println("a2:"+a2);
		System.out.println("y2:"+y2);
		
		
		int a3=10;
		//prefix operator hence now a3=11 + again it increment by 1 now a3=12
		//y3=11+12
		int y3=++a3 + ++a3;
		
		System.out.println("y3:"+y3);
		System.out.println("a3:"+a3);
		
		
		
		

	}

}
