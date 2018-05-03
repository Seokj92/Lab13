package edu.handong.csee.java.lab13.prob3; //package name

import java.util.Scanner; //import java.util.Scanner package

abstract class Shape{ //declare an abstract class
	public abstract double area(); //declare an abstract method 
	public abstract double perimeter(); //declare an abstract method
	public void printOut() //declare a method, there's no return type.
	{
		System.out.println("Area : " +area() + "\nPerimeter : " + perimeter() + "\n"); //print out this string (call the two abstract method)
	}
	
}

class Rectangle extends Shape{ //Rectangle class inherits Shape class
	private double length; //declare double variable
	private double width; //declare double variable
	public Rectangle(double length, double width) //constructor
	{
		this.length = length; //initiate variable length
		this.width = width; //initiate variable width
	}
	
	public double area() //declare a method
	{
		return length*width; //return the area of rectangle
	}
	
	public double perimeter() //declare a method
	{
		return (length+width)*2; //return the perimeter of rectangle
	}
	
	public double get_Length() //declare a method
	{
		return length; //return the length of rectangle
	}
	
	public double get_Width() //declare a method
	{
		return width; //return the width of rectangle
	}
}

class Circle extends Shape{ //Circle class inherits Shape class
	
	private double radius; //declare a double variable
	
	public Circle(double r) //constructor
	{
		radius = r; //initiate variable radius
	}
	
	public double area() //declare a method
	{
		return Math.PI * Math.pow(radius, 2); //return the area of circle
	}
	
	public double perimeter() //declare a method
	{
		return 2.0 * Math.PI * radius; //return the perimeter of circle
	}
	
	public double get_Radius()// declare a method
	{
		return radius; //return the radius of circle
	} 
}

public class Prob3{ //declare a public class
	
	public static void main(String[] args) { // this is a main method
		
		double n1, n2; //declare double variables
		Scanner sc = new Scanner(System.in); // make the Scanner instance to get the number from keyboard.
		
		System.out.print("Enter radius : "); //print out this string
		n1 = sc.nextDouble(); //initiate the variable n1 with input from user
		Circle c1 = new Circle(n1); // instantiate Circle class.
		System.out.println("Radius : " + c1.get_Radius()); //print out this string.(call the get_radius() method from c1 instance)
		c1.printOut(); //call the printOut method from c1 instance
		System.out.print("Enter length and width : "); //print out the string
		n1 = sc.nextDouble(); //initiate the variable n1 with input from user
		n2 = sc.nextDouble(); //initiate the variable n2 with input from user
		Rectangle r1 = new Rectangle(n1, n2); //instantiate Rectangle lass
		
		System.out.println("Length : " + r1.get_Length()); //print out the length(call the get_Length method from r1 instance)
		System.out.println("Width : " + r1.get_Width()); //print out the width(call the get_width method from r1 instance)
		r1.printOut(); //call the printOut method from r1 instance
		
	}
}