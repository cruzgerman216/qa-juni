package com.qa.examplejunit.house;

public class Door {
	protected Boolean isOpen;

	// Constructors
	public Door() {
		super();
		isOpen = false;
	}

	// overloading 
	public Door(boolean isOpen) {

		this();
		this.isOpen = isOpen;
	}

	public boolean openDoor() {
		return isOpen = true;
	}

	public boolean closeDoor() {
		return isOpen = false;
	}

	public boolean isOpen() {
		return isOpen;
	}
}
