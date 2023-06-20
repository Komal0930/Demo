package com.assignments3;

import java.util.Scanner;

public class BillForTomInDoWhile {

	public static void main(String[] args) {
		char choice;
		Scanner sc=new Scanner (System.in);
		do 
		{
			int p;
			int puffs;
			int colddrinks;
			int totalbill;
			System.out.println("Enter the number of pizzas bought");
			System.out.println("Enter the number of puffs bought");
			System.out.println("Enter the number of colddrinks bought");
			p=sc.nextInt();
			puffs=sc.nextInt();
			colddrinks=sc.nextInt();
			System.out.println("No of Pizzas:"+p);
			System.out.println("No of Puffs:"+puffs);
			System.out.println("No of Cold Drinks:"+colddrinks);
			totalbill=(p*100)+(puffs*20)+(colddrinks*10);
			System.out.println("Total Bill:"+totalbill);
		
		    System.out.println("Do you Want to more:"+"Yes"+"No");
		    choice=sc.next().charAt(0);
		}
		while (choice=='y'||choice=='Y');
		System.out.println("Thank You");
		
	}

}
