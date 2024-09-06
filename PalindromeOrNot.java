package task2;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) 
	{
		// To check given string is Palindrome or not
		
		Scanner sc=new Scanner (System.in);      //for the getting input through console
		System.out.println("Enter the name to check for Palindrome or Not: ");
		String name=sc.next(); // Getting the input string from console
		char reverse;          
	    String PalinName="";    //Created a empty string to store the reverse string
				
		for (int i=name.length()-1;i>=0;i--)
		{
		 reverse=name.charAt(i);          //read the each character 
		 PalinName=PalinName+reverse;     //adding the character to string
		}                                 //will get the complete reverse string
				
		if (name.equalsIgnoreCase(PalinName))        //Checking original string and reverse string are same irrespective of case sensitivity
			System.out.println("Its a Palindrome String");   //if both are same, its a Palindrome
		else
	    	System.out.println("Its not a Palindrome String");   //If both are not same, its not a Palindrome
	}

}
