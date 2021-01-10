package main.java.com.DimaSahachko.designPatterns.solutions.command;
/*Task description is in the CarOwner class*/
public class StartEngineCommand implements Command {
	Car car;

	public StartEngineCommand(Car car) {
		super();
		this.car = car;
	}
	
	public void execute() {
		car.startEngine();
	}
}
