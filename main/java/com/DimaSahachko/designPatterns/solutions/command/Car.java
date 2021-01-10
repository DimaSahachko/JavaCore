package main.java.com.DimaSahachko.designPatterns.solutions.command;
/*Task description is in the CarOwner class*/
public class Car {
	public void startEngine() {
		System.out.println("Engine has been started");
	}
	public void openDoors() {
		System.out.println("Doors have been opened");
	}
	public void alarmOff() {
		System.out.println("An alarm is off");
	}
}
