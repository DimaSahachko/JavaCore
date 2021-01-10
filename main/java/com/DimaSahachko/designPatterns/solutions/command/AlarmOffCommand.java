package main.java.com.DimaSahachko.designPatterns.solutions.command;
/*Task description is in the CarOwner class*/
public class AlarmOffCommand implements Command {
	Car car;

	public AlarmOffCommand(Car car) {
		super();
		this.car = car;
	}
	
	public void execute() {
		car.alarmOff();
	}
}
