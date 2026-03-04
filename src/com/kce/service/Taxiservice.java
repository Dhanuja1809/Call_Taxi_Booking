package com.kce.service;

import java.util.ArrayList;
import java.util.List;

import com.kce.bean.Booking;
import com.kce.bean.Taxi;
public class Taxiservice {
private List<Taxi>taxis=new ArrayList<>();
private int bookingcount=1;
public Taxiservice(int taxicount)
{
	for(int i=1;i<=taxicount;i++)
	{
		taxis.add(new Taxi(i));
	}
}
public void Booktaxi(int customerid,char pickup,char drop,int pickuptime)
{
	Taxi allocatedTaxi=null;
	int minDistance=Integer.MAX_VALUE;
	for(Taxi taxi:taxis)
	{
		if(taxi.getFreetime()<=pickuptime)
		{
			int distance=Math.abs(taxi.getCurrentlocation()-pickup);
			if(distance<minDistance)
			{
				allocatedTaxi=taxi;
				distance=minDistance;
			}else if(distance==minDistance)
			{
				if(taxi.getTotalearning()<=allocatedTaxi.getTotalearning())
				{
					allocatedTaxi=taxi;
				}
			}
		}
	}
	if(allocatedTaxi==null)
	{
		System.out.println("allocated taxi is not available");
	return ;
	}
		int distance=Math.abs(pickup-drop)*15;
		int amount=calculate(distance);
		int travelTime=Math.abs(pickup-drop);
		int droptime=Math.abs(travelTime+pickuptime);
		Booking booking=new Booking(bookingcount++,customerid,pickup,drop,pickuptime,droptime,amount);
			allocatedTaxi.Addbookings(booking);
			allocatedTaxi.Addearnings(amount);
			allocatedTaxi.setCurrentlocation(drop);
			allocatedTaxi.setFreetime(droptime);
			System.out.println("taxi can be allotted");
			System.out.println("Taxi-"+allocatedTaxi.getTaxiid()+"is allotted");	
	
}
private int calculate(int distance)
{
	if(distance<=5)
	{
		return 100;
	}
	return 100+(distance-5)*10;
}
public void display()
{
	for(Taxi taxi:taxis)
	{
		System.out.println("Taxi="+taxi.getTaxiid()+"total-earnings:"+taxi.getTotalearning());
		for(Booking booking:taxi.getBookings())
		{
			System.out.println("customerid:"+booking.getCustomerid()+"pickup:"+booking.getPickup()+"pickuptime:"+booking.getPickuptime()+"amount:"+booking.getAmount());
		}
	}
}
}
