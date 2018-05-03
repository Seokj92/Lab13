package edu.handong.csee.java.lab13.prob6; //package name

interface CapitalPrintable { //declare an interface
	
}

class printer { //declare a class
	public static void print(Object object) //declare a static method, There is no return type(void)
	{
		String str = object.toString(); //declare string variable and initiate it with object.toString()
		if(object instanceof CapitalPrintable) //if instance that object refer is instance of class that implement CapitalPrintable 
			str = str.toUpperCase(); //set the value of str with str.toUppercase()
		System.out.println(str);//print out the value of str
	}
}

class DownPoint{ //declare a class
	private int x, y; //declare a private int variables
	DownPoint(int x, int y){this.x = x; this.y =y;} //constructor that initiate variable x,y
	public String toString()//declare a toString() method
	{
		return "x : " + x + " y : " + y; //return this sentence
	}
}

class UpPoint implements CapitalPrintable { //Class UpPoint implements interface CapitalPrintable
	private int x, y; //declare int variables
	
	UpPoint(int x, int y){this.x = x; this.y = y;} //constructor that initiate variable x,y
	
	public String toString() //declare a toString() method
	{
		return "x : " + x + " y : " + y; //retrun this sentence
	}
}

public class Prob6 {
	
	public static void main(String[] args) { 
		UpPoint p1 = new UpPoint(3,3);
		DownPoint p2 = new DownPoint(2,5);
		DownPoint p3 = new DownPoint(4,7);
		UpPoint p4 = new UpPoint(9,12);
		printer.print(p1);
		printer.print(p2);
		printer.print(p3);
		printer.print(p4);
	}
}

