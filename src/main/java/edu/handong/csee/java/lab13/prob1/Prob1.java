package edu.handong.csee.java.lab13.prob1; //package name


class Friend { //declare a class(Sup class)
	
	public void justFriend() //declare a method
	{
		System.out.println("Just Frined!"); //print out this string.
	}

}

class SchoolFriend extends Friend{ //SchoolFriend class inherits Friend class(SchoolFriend class is a Sub class)
	
	public void schoolFriend() //declare a method
	{
		System.out.println("School Frined!"); //print out this string
	}
}

class ClassFriend extends SchoolFriend{ //ClassFriend class inherits SchoolFriend class(ClassFriend class is a Sub class)
	
	public void classFriend() //declare a method
	{
		System.out.println("Class Frined!"); //print out this string
	}
}

class InstanceOf { //declare a class
	
	public static void whatFriend(Friend friend) //declare a static method
	{
		if(friend instanceof ClassFriend) //if friend refers to instance of ClassFriend or instance that inherit ClassFrined
			((ClassFriend)friend).classFriend(); //after type casting, call the classFriend method
		else if(friend instanceof SchoolFriend) //if friend refers to instance of SchoolFriend of instance that inherit SchoolFrined
			((SchoolFriend)friend).schoolFriend(); //after type casting, call the shoolFriend method
		else
			friend.justFriend(); //call the justFriend method
	}
}
	
class Prob1 { //declare a class
	
	public static void main(String[] args) { //declare a main method
		
		Friend friend1 = new Friend(); //instantiate Friend class.
		SchoolFriend friend2 = new SchoolFriend(); //instantiate SchoolFriend class.
		ClassFriend friend3 = new ClassFriend(); //instantiate ClassFriend class.
		
		InstanceOf.whatFriend(friend1); //call the whatFriend method of InstanceOF class, parameter is friend1(instantiated before)
		InstanceOf.whatFriend(friend2); //call the whatFriend method of InstanceOF class, parameter is friend2(instantiated before)
		InstanceOf.whatFriend(friend3); //call the whatFriend method of InstanceOF class, parameter is friend3(instantiated before)
	}
}