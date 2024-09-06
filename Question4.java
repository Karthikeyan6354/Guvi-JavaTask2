package task2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) 
	{
		// To print the stars in provided format
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to pring the X pattern: ");
		int number=sc.nextInt();   //getting the input from the console
		System.out.println("The output is");
		//I have separated the line as rows and columns
		for (int i=1;i<=number;i++)    //it will run no of time of input
		{
			for(int j=1;j<=number;j++)  //it will run no of time of input
			{
				if (i==j || i+j==number+1)  //whenever i and j are equal, sum of i and j are equal to n+1 
					System.out.print("*");  //if condition is true, then print '*' value
				else
					System.out.print(" ");  //if condition is false, then print space only.
			}
			System.out.println();
		}	

	}
}
