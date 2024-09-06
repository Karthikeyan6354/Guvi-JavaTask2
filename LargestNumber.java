package task2;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// To print the largest number among 3 numbers
		Scanner sc=new Scanner (System.in);     //Scanner class to get the input from console
		System.out.println("Program for find out the largest number among 3 numbers");
		System.out.println("Enter the value of a: ");
		int a=sc.nextInt();                        //to get the integer 'a' value from console
		System.out.println("Enter the value of b: ");
		int b=sc.nextInt();                        //to get the integer 'b' value from console
		System.out.println("Enter the value of c: ");
		int c=sc.nextInt();                        //to get the integer 'c' value from console'
		
		if (a>b && a>c)     // Checking the condition, whether a is larger than b and c
			System.out.println("a is the largest number than b and c");
		else
		   {
			if(b>a && b>c)   // Checking the condition, whether b is larger than a and c
				System.out.println("b is the largest number than a and c");
			else             //otherwise c is the largest number than a and b
				System.out.println("c is the largest number than a and b");
		   }	
	}

}
