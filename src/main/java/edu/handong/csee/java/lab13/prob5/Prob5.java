package edu.handong.csee.java.lab13.prob5; //package name

import java.util.Scanner; //import java.util.Scanner package

public class Prob5 { //declare a class
	
	public static boolean equals(int[][] m1, int[][] m2) { //declare a static method, return type is boolean
		int count = 0; //declare int variable, initiate the value 0 for counting
		if(m1.length != m2.length) //if length of arrays are different
			return false; //return false
		for (int i=0; i< m1.length; i++) //for statement runs until i<m1.length
		{
			for(int j=0; j<m1[i].length; j++)//for statement runs until j<m1[i].length
			{
				if(m1[i][j]!=m2[i][j])//if the value of matrix is different
					count++;//count increases.
			}
		}
		if(count<=3) //if count is under3 or same as 3
			return true; //return true
		else //otherwise
			return false; //return false
	}
	
	public static void main(String[] args) { //This is a main method
		int n1, n2=0; //declare int variables
		Scanner sc = new Scanner(System.in); //make the Scanner instance to get the number from keyboard
		System.out.print("Enter row size(maximum 5):"); //print out this sentence
		n1 = sc.nextInt(); //initiate n1 variable with input from user.
		System.out.print("Enter column size(maximum 5) :"); //print out this sentence
		n2 = sc.nextInt(); //initiate n2 variable with input from user.
		int[][] m1 = new int[n1][n2]; //make a 2D array
		System.out.print("Enter row size(maximum 5) : ");//print out this sentence
		n1 = sc.nextInt(); //initiate n1 variable with input from user.
		System.out.print("Enter column size(maximum 5) : ");//print out this sentence
		n2 = sc.nextInt(); //initiate n2 variable with input from user.
		int [][] m2 = new int[n1][n2]; //make a 2D array
		System.out.print("Enter List1 : "); //print out this sentence
		for (int i =0; i<m1.length; i++) //for statement runs until i<m1.length
			for(int j=0; j<m1[i].length; j++) //for statement runs until j<m1[i].length
				m1[i][j] = sc.nextInt(); //initiate m1[i][j] with input from user
		
		System.out.print("Enter list2 : "); //print out this sentence
		for (int i =0; i<m2.length; i++) { //for statement runs until i<m2.length
			for (int j=0; j<m2[i].length; j++) //for statement runs until j<m2[i].length
				m2[i][j] = sc.nextInt(); //initiate m2[i][j] with input from user
		}
		for (int i =0; i<m1.length; i++) { //for statement runs until i<m1.length
			for(int j=0; j<m1[i].length; j++) // for statement runs until j<m1[i].length
				System.out.print(m1[i][j] + " "); //print out this sentence
			System.out.println(); //print a space
		}
		System.out.println(); // print a space		
		for(int i=0; i<m2.length;i++) { //for statement runs until i<m2.length
			for(int j=0; j<m2[i].length; j++) // for statement runs until j<m2[i].length
				System.out.print(m2[i][j] + " "); //print out the sentence
			System.out.println(); //print a space
		}
		System.out.println(); //print a space
		
		if(equals(m1,m2)) //compare m1,m2(whether it is approximately equals or not)
			System.out.println("the two arrays are approximately identical."); // print out this sentence
		else //otherwise
			System.out.println("the two arrays are not identical"); //print out this sentence
				
		}
	}


