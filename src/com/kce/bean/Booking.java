package com.kce.bean;

public class Booking {
private int bookingid;
private int customerid;
private char pickup;
private char dropup;
private int pickuptime;
private int dropuptime;
private int amount;
public Booking(int bookingid,int customerid,char pickup,char dropup,int pickuptime,int dropuptime,int amount)
{
	super();
	this.bookingid=bookingid;
	this.customerid=customerid;
	this.pickup=pickup;
	this.dropup=dropup;
	this.pickuptime=pickuptime;
	this.dropuptime=dropuptime;
	this.amount=amount;
}
public int getBookingid() {
	return bookingid;
}
public void setBookingid(int bookingid) {
	this.bookingid = bookingid;
}
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public char getPickup() {
	return pickup;
}
public void setPickup(char pickup) {
	this.pickup = pickup;
}
public char getDropup() {
	return dropup;
}
public void setDropup(char dropup) {
	this.dropup = dropup;
}
public int getPickuptime() {
	return pickuptime;
}
public void setPickuptime(int pickuptime) {
	this.pickuptime = pickuptime;
}
public int getDropuptime() {
	return dropuptime;
}
public void setDropuptime(int dropuptime) {
	this.dropuptime = dropuptime;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
}
