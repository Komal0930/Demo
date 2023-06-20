package com.demo;

public class TypeCasting {

	public static void main(String[] args) {
		byte num1=20;
		byte num2=40;
		// by default all arithmetic operation will go into int
		byte sum= (byte) (num1+num2);
		
		int sum1 = num1+num2;
		 System.out.println(sum1);
		 System.out.println(sum);
		 
		short s1=89;
		short s2=37;
		
		 short result = (short)(s1+s2);
		 System.out.println(result);
		 
		 float f1= 3.26f;
		 float f2 = 25.67f;
		 // if we want decimal values in result use following statement
		 float add = (float)(f1+f2);
		 System.out.println(add);
		 
		 
		 char ch = 'z';
		 char ch1 = 'y';
		 // if we add ch then it convert it into ASCII code and gives ans in int
		 int r= ch+ch1;
		 System.out.println(r);
		  long d=25;
		  long h=56;
		  long  f= (long) (d+h);
		  System.out.println(f);
		  
		  

	}

}
