package edu.handong.csee.java.lab13.prob2; //package name

class Book { //declare a class
	
	private static int count = 0; //declare a static int variable(the value is initiated 0 for counting) 
	private String name; //declare a string variable
	private int id; //declare a int variable
	public Book(String name) //constructor
	{
		this.name = name; //initiate name variable
		count++; //increase count value
		id = count; //put the value of count to id
	}
	
	public String toString() //declare a method, return type is String.
	{
		return "\n\tID : " + id + "\n\tbook name : " + name; // return this string.
	}
	
	public void printOut() //declare a method
	{
		System.out.println("<<<BOOK>>>" + this.toString()); //print out the result.(call the toString method)
	}
}

class Science extends Book { //Science class inherit Book class.
	private String publisher; //declare a string variable
	public Science(String name, String publisher) //constructor
	{
		super(name); // call the constructor of sup class.
		this.publisher = publisher; //initiate publisher variable
	}
	
	public String toString() //declare a method. return type is String.
	{
		return super.toString() + "\n\tPublisher : " + publisher; //return this string(call the toString method from sup class)
	}
	
	public void printout() //declare a method
	{
		System.out.println("<<<Science>>>" + this.toString()); //print out this string(call the toString method)
				
	}
}

class History extends Book{ //History class inherit Book class.
	private String Author; //declare a String variable
	public History(String name, String Author) //Constructor
	{
		super(name); //call the constructor of sup class
		this.Author = Author; //initiate Author variable.
	}
	
	public String toString() //declare a method. return type is String.
	{
		return super.toString() + "\n\tAuthor : " + Author; //return this string(call the toString method from sup class)
	}
	
	public void printout() //declare a method
	{
		System.out.println("<<<History>>>" + this.toString()); //print out this sentence(call the toString method)
	}
}

public class Prob2{ //declare a public class
	
	public static void main(String[] args) { //this is a main method
		Book instance1 = new Book("Simple Book"); //instantiate book class
		Science instance2 = new Science("Hello Physics!", "ScienceWorld"); //instantiate Science class
		History instance3 = new History("What is history?" , "E.H.Carr"); //instantiate History class
		History instance4 = new History("The South Korea", "Judis"); //instantiate History class
		instance1.printOut(); //call the printOut method from instance1
		instance2.printout(); //call the printOut method from instance2
		instance3.printout(); //call the printOut method from instance3
		instance4.printout(); //call the printOut method from instance4
	}
	
}