package main.java.com.DimaSahachko.designPatterns.solutions.singleton;
/*Task description is in the Singleton class*/

public class Door {
	private static Door instance;
	int enterCount;
	int exitCount;

	private Door() {
	}
	public static synchronized Door getDoor() {
		if(instance == null) {
			instance = new Door();
		}
		return instance;
	}
	void open() {
		enterCount++;
		System.out.println("Door is open");
	}
	void shut() {
		exitCount++;
		System.out.println("Door is closed");
	}
	Integer getPeopleInside() {
		if((enterCount - exitCount) < 0) {
			System.out.println("Something went wrong");
			return null;
		} else {
		return enterCount - exitCount;
		}
	}
}
