package edu.handong.csee.java.lab13.prob4; //package name

import java.util.Scanner; //import java.util.Scanner package

class Animal{ //declare a class
	private String name; //declare a String variable
	public void set_Name(String name) //declare a method to set the name
	{
		this.name=name; //initiate name variable
	}
	
	public void get_Name() //declare a method to get the name
	{
		System.out.println("Name : "+name); //print out this sentence
	}
}

interface Pet //declare an interface
{
	public String food();//this is an abstract method
}

class Cat extends Animal implements Pet { //Cat class inherits Animal class and implements Pet interface
	public String food() //implement the food() method of Pet interface
	{
		return "(Cat!)Fish"; //return this string
	}
}

class Dog extends Animal implements Pet { //Dog class inherits Animal class and implements Pet interface
	public String food() //implement the food() method of pet interface
	{
		return "(Dog!)Sausage"; //return this string
	}
}

public class Master { //declare a public class
	public void feed(Pet pet) //declare a method
	{
		System.out.println("feed : " + pet.food()); //print out this sentence(call the food() method)
	}


	public static void main(String[] args) { // this is a main method
		String cat_Name, dog_Name; // declare a string variables
	
		Master master = new Master(); //instantiate Master class
		Cat cat = new Cat(); //instantiate Cat class
		Dog dog = new Dog(); //instantiate Dog class
	
		Scanner sc = new Scanner(System.in); //make the Scanner instance to get the number from keyboard.
		System.out.print("Enter the cat name and dog name : "); //print out this sentence
		cat_Name = sc.next(); //initiate the variable cat_Name with input from user
		dog_Name = sc.next(); //initiate the variable dog_Name with input from user
	
		cat.set_Name(cat_Name); //call the set_Name method of cat instance
		cat.get_Name(); // call the get_Name method of cat instance
		master.feed(cat); // call the feed method of master instance
	
		dog.set_Name(dog_Name); // call the set_Name method of dog instance
		dog.get_Name(); // call the get_Name method of dog instance
		master.feed(dog); // call the feed method of master instance
	}

}