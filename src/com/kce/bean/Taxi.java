package com.kce.bean;

import java.util.ArrayList;
import java.util.List;

public class Taxi {
private int taxiid;
private char currentlocation;
private int freetime;
private int totalearning;
private List<Booking>bookings=new ArrayList<>();
public Taxi(int taxiid)
{
	this.taxiid=taxiid;
	this.currentlocation='A';
	this.freetime=0;
	this.totalearning=0;
	this.bookings=new ArrayList<>();
}
public int getTaxiid() {
	return taxiid;
}
public void setTaxiid(int taxiid) {
	this.taxiid = taxiid;
}
public char getCurrentlocation() {
	return currentlocation;
}
public void setCurrentlocation(char currentlocation) {
	this.currentlocation = currentlocation;
}
public int getFreetime() {
	return freetime;
}
public void setFreetime(int freetime) {
	this.freetime = freetime;
}
public int getTotalearning() {
	return totalearning;
}
public void setTotalearning(int totalearning) {
	this.totalearning = totalearning;
}
public List<Booking> getBookings() {
	return bookings;
}
public void setBookings(List<Booking> bookings) {
	this.bookings = bookings;
}
public void Addbookings(Booking booking)
{
	bookings.add(booking);
}
public void Addearnings(int amount)
{
	this.totalearning+=amount;
}
}
