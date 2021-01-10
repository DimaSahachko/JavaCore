package main.java.com.DimaSahachko.designPatterns.solutions.singleton;
/*Task description is in the Singleton class*/

public class Worker {
	void goInside() {
		Door.getDoor().open();
	}
	void goOutside() {
		Door.getDoor().shut();
	}
}
