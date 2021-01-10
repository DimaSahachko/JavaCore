package main.java.com.DimaSahachko.designPatterns.solutions.command;
/*We have a Car that can do different things: start an engine, off an alarm, open the doors. And we want to do these things remotely.
 * We have a RemoteCarKey that receive in constructor three commands each of which is a concrete realization of Command interface.
 * In this example the Car class is a "receiver" - it receives commands and fulfill them.
 * The RemoteCarKey class is a "invoker" in make the car do things.
 * Command classes are encapsulated requests.
 * The CarOwner class is a client class which join all parts of the program together. */
public class CarOwner {

	public static void main(String[] args) {
		Car myCar = new Car();
		RemoteCarKey key = new RemoteCarKey(new DoorsOpenCommand(myCar), new StartEngineCommand(myCar), new AlarmOffCommand(myCar));
		key.offAlarm();
		key.openDoors();
		key.startEngine();
	}	

}
