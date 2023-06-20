package com.demo1;
import java.util.Scanner;

public class PriceQuantity {

	public static void main(String[] args) {
		int q, p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Fruit name");
		System.out.println("Enter the Quantity");
		System.out.println("Enter the Price");
		String fruit;
	    fruit=sc.next();
	    q=sc.nextInt();
	    p=sc.nextInt();
	    
	    
	    int bill;
	    bill= q*p;
	    System.out.println("total bill for this fruit is:"+bill);
	    
	   
	    
		

	}

}
