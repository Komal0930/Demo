package com.demo1;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		int units;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Units");
		units=sc .nextInt();
		 if (units<=50)
		 {
			 float amt=units*0.5f;
			 float surfaccharge=amt*0.20f;
			 float totalbill=  amt+surfaccharge; 
			 System.out.println(" amount for these units is:"+amt);	
			 System.out.println(" total amount with adding surface charge for these units is:"+amt);
		 }
		 else if (units>=50 && units<=100)
		 {
			float amt=(float) (50 * 0.5 + (units-50) * 0.75f);
			float surfaccharge=amt*0.20f;
			 float totalbill= (float)  amt+surfaccharge; 
			 System.out.println(" amount for these units is:"+amt);	
			 System.out.println(" total amount with adding surface charge for these units is:"+amt);
		
		}
		 else if (units<=200)
		 {
			 float amt = (float) (50 * 0.5 + 100 * 0.75+(units-100)*1.20f);
			 float surfaccharge=amt*0.20f;
			 float totalbill=  amt+surfaccharge; 
			 System.out.println(" amount for these units is:"+amt);	
			 System.out.println(" total amount with adding surface charge for these units is:"+amt);
		 }
		 else if (units<=250);
		 {
			 float amt=(float)(50*0.5 + 100*0.75 + 200*1.20 + (units-200)*1.50f);
			 float surfaccharge=amt*0.20f;
			 float totalbill=  amt+surfaccharge; 
			 System.out.println(" amount for these units is:"+amt);	
			 System.out.println(" total amount with adding surface charge for these units is:"+amt);
			 
		 }
		
	}

}
