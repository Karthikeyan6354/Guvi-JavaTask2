package task2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) 
	{
		// To print the numbers in provided format
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input=sc.nextInt();          //reading the input from the console
		int number =1;    //assigned the value as 1 to number, it will start to print from 1
		System.out.println("The output is: ");
		for (int line=1;line<=input;line++)   //execute the loop number of times as per input 
		{                                     //to print the line
			
			for (int k=1;k<=line;k++)  //this loop will run, number of times of line
			{
				System.out.print(number + " ");   //print the number with space in a line
				number++;
			}
			
		 System.out.println();      //Print a empty line for next row
		}
		

	}

}
