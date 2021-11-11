package com.qa.qacommunity;

public class Runner {

	
	public static void main(String[] args) {
		
		Encapsulation person1 = new Encapsulation();
		
		person1.setCabinPressure((float) 2.9);
		person1.setFlightNumber(359);
		person1.setDestination("Cuba");
		person1.setFlightTime(13.04);
		person1.setPassportNumber(2019735);
		
		
		System.out.println(person1.getPassportNumber());
		
		System.out.println(person1);
		
	}
}
