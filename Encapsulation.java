package com.qa.qacommunity;

public class Encapsulation {
	
	private String destination;
	private int flightNumber;
	private double flightTime;
	private float cabinPressure;
	private long passportNumber;
	
	// CONSTRUCTORS
	
	public Encapsulation() {
		super();
		
		
	}
	public Encapsulation(String destination, int flightNumber, double flightTime, float cabinPressure,
			long passportNumber) {
		super();
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.flightTime = flightTime;
		this.cabinPressure = cabinPressure;
		this.passportNumber = passportNumber;
	}
	
	
	//GETTERS AND SETTERS DESTINATION
	
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	//GETTER AND SETTER FLIGHTNUMBER
	
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	//GETTER AND SETTER FLIGHTTIME
	
	public double getFlightTime() {
		return flightTime;
	}
	public void setFlightTime(double flightTime) {
		this.flightTime = flightTime;
	}
	
	//GETTER AND SETTER CABINPRESSURE
	
	public float getCabinPressure() {
		return cabinPressure;
	}
	public void setCabinPressure(float cabinPressure) {
		this.cabinPressure = cabinPressure;
	}
	
	//GETTER AND SETTER PASSPORTNUMBER
	
	public long getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(long passportNumber) {
		this.passportNumber = passportNumber;
	}
	
	
	// TOSTRING
	
	@Override
	public String toString() {
		return " destination=" + destination + ", flightNumber=" + flightNumber + ", flightTime="
				+ flightTime + ", cabinPressure=" + cabinPressure + ", passportNumber=" + passportNumber + "";
	}
	
	
	
	
	
	
	}
	
	


