package main.java.com.DimaSahachko.designPatterns.examples.facade;

public class Developer {
	public void doWorkBeforeDeadLine(BugTracker bugTracker) {
		if(bugTracker.isActiveSprint()) {
			System.out.println("Developer is solving problems...");
		} else {
			System.out.println("Developer is reading Habrahabr");
		}
	}
}	
