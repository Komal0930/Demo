package com.assignments3;

import java.util.Scanner;

public class BillForTom {

	public static void main(String[] args) {
		int p;
		int puffs;
		int colddrinks;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of pizzas bought");
		System.out.println("Enter the number of puffs bought");
		System.out.println("Enter the number of colddrinks bought");
		p=sc.nextInt();
		puffs=sc.nextInt();
		colddrinks=sc.nextInt();
		
		int totalbill;
		totalbill=(p*100)+(puffs*20)+(colddrinks*10);
		System.out.println("No of Pizzas:"+p);
		System.out.println("No of Puffs:"+puffs);
		System.out.println("No of Colddrinks:"+colddrinks);
		System.out.println("Total Bill is :"+totalbill);
		
		

	}

}
