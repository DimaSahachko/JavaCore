package main.java.com.DimaSahachko.designPatterns.solutions.command;
/*Task description is in the CarOwner class*/
public class RemoteCarKey {
	Command open;
	Command start;
	Command alarmOff;
	
	public RemoteCarKey(Command open, Command start, Command alarmOff) {
		super();
		this.open = open;
		this.start = start;
		this.alarmOff = alarmOff;
	}
	
	public void openDoors() {
		open.execute();
	}
	public void startEngine() {
		start.execute();
	}
	public void offAlarm() {
		alarmOff.execute();
	}
	
}
