package main.java.com.DimaSahachko.designPatterns.examples.facade;

public class WorkFlow {
	Developer developer = new Developer();
	BugTracker bugTracker = new BugTracker();
	Work work = new Work();
	
	public void solveProblems() {
		work.doWork();
		bugTracker.startSprint();
		developer.doWorkBeforeDeadLine(bugTracker);
	}
	
}
