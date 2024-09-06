package task2;

import java.util.Scanner;

public class HotelTariff {

	public static void main(String[] args) {
		// To calculate of hotel tarif
		
		Scanner sc=new Scanner(System.in);   //Scanner class to getting the input from console
		System.out.println("Enter the Month");
		int Month=sc.nextInt();         //to get the information of Month
		System.out.println("Enter the Room Rent per day");
		double RoomRent=sc.nextDouble();     //to get the room rent per day
		System.out.println("No of days");
		int days=sc.nextInt();           //to get the no of day
		double total=0;                  //declared total amount as double for decimal value
		System.out.println("Hotel Tariff amount is: ");
		switch(Month)           //created switch case to calculate the tariff amount based on the month
		{
		case 4: case 5: case 6: case 11: case 12:
			total=(days*RoomRent)+((days*RoomRent)/5);  //20% extra during the peak seasons as mentioned
			System.out.format("%.2f",total);
			break;
		default:
			total=days*RoomRent;
			System.out.format("%.2f",total);  //to format float value with 2 decimal values
			break;
		}
	}

}
