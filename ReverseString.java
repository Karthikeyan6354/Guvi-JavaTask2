package task2;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		// To get the reverse string
		
		Scanner sc=new Scanner (System.in);    //to provide input from the console
		System.out.println("Enter the name: ");
		String OriName=sc.next();        //getting the input from the console
		char ch;
		String RevName ="";              //Declared a Empty string to assign the character
		for (int i=OriName.length()-1;i>=0;i--)
		{
			ch=OriName.charAt(i);         //to Assign the last Character from string to 'Ch' variable
			RevName=RevName+ch;           //adding the character from 'Ch' variable to string
			
		}
		System.out.println("Reverse String: "+RevName);   //To print the resulted reversed string
		
	}

}
