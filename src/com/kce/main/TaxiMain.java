package com.kce.main;

import java.util.Scanner;

import com.kce.service.Taxiservice;

public class TaxiMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Taxiservice service= new Taxiservice(4);
		while(true)
		{ System.out.println("welcome to Call_Taxi Service");
		System.out.println("enter your choice:");
			System.out.println("1 BookTaxi");
			System.out.println("2 Display Taxi");
			System.out.println("3 Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter the customerid:");
				int customerid=sc.nextInt();
				System.out.println("enter the pickup(A-F):");
				char pickup=sc.next().toUpperCase().charAt(0);
				System.out.println("enter the drop point(A-F)");
				char drop=sc.next().toUpperCase().charAt(0);
				System.out.println("enter the pickup time");
				int pickuptime=sc.nextInt();
				service.Booktaxi(customerid, pickup, drop, pickuptime);
				break;
			case 2:
				service.display();
				break;
			case 3:
				System.exit(0);
			}
		}

	}

}
