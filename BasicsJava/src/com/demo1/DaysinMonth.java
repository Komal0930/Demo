package com.demo1;

import java.util.Scanner;

public class DaysinMonth {

	public static void main(String[] args) {
	  int month;
	  Scanner sc=new Scanner (System.in);
	  System.out.println("Enter the Month No From 1 to 12");
	  month=sc.nextInt();
	  
	  if (month ==1 || month ==3 || month==5 || month==7 ||month==8 || month==10 || month==12)
	  {
		  System.out.println("31 Days in this month");
	  }
	  else  if (month==4 || month==6 || month==9 || month==11 )
	  {
		  System.out.println("30 Days in this month");
	  }
	  else if (month==2)
	  {
		  System.out.println("Either 28 or 29 days in this month");

	  }
	  else 
	  {
		  System.out.println("Please enter valid num");
		  
	  }
	}

}
