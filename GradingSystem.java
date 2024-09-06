package task2;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		// To Print the grade as per provided marks 
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Anna University Grading System");
		System.out.println("Enter your mark: "); 
		int mark=sc.nextInt();    //to get the input from the console
		int grade=mark/10;        //here, I calculated the average, based on that, I made to switch case to print the grades as their marks
		if (mark<=100)            //if the mark is valid, then switch case will execute                   
		{
		System.out.println("Your Grade is: ");
		switch(grade)             //based on the average value, switch case will print the grades
		    {
		     case 10: System.out.println("S");break;   //Mark is 100 
		     case 9: System.out.println("A");break;    //Mark is 99 to 90
		     case 8: System.out.println("B");break;    //Mark is 89 to 80
		     case 7: System.out.println("C");break;    //Mark is 79 to 70
		     case 6: System.out.println("D");break;    //Mark is 69 to 60
		     case 5: System.out.println("E");break;    //Mark is 59 to 50
		     default: System.out.println("F");break;   //less than 50
		    }
		  }
		else
		  {
			System.out.println("Invalid Mark - Enter the correct mark");  // if the mark is more than 100
		  }
		
	}

}

