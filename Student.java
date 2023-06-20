package com.oops;

public class Student {

	int id;
	String name;
	double per;
	String city;

	// acessmodifier return_type method_name()
	// {
	// logical code
	// }

	// no return_type no paramter
	public void display()// method defination
	{
		System.out.println("Hi this is display method..");// method body
	}

	// no return type with paramter
	public void addition(int x, int y) {
		System.out.println("Addition= " + (x + y));

	}

	// with return type no parameter

	public int getData() {
		int sal = 56000;
		return sal;
	}
	// with return type with paramter

	public double areaOfCircle(double PI, int radius) {
		double area = PI * radius * radius;
		return area;
	}

	public static void main(String[] args) {

		Student stud = new Student();
		stud.display();// method calling

		stud.addition(4, 6);

//		int ans = stud.getData();
//		System.out.println("salary=  " + ans);
		
		System.out.println(stud.getData());

		double result = stud.areaOfCircle(3.14, 4);
		System.out.println("Area of circle= " + result);

	}

}
