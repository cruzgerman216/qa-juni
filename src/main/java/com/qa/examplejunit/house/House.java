package com.qa.examplejunit.house;

import java.util.List;

public class House {
	protected Door frontDoor;
	protected List<Window> propertyWindow;
	protected String address;
	protected Garage attachGarage;
	
	public House() {
		super();
	}

	public House(Door frontDoor, List<Window> propertyWindow, String address, Garage attachGarage) {
		super();
		this.frontDoor = frontDoor;
		this.propertyWindow = propertyWindow;
		this.address = address;
		this.attachGarage = attachGarage;
	}
	
	public boolean openFrontDoor() {
		return this.frontDoor.openDoor();
	}
}
