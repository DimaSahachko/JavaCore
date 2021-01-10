package main.java.com.DimaSahachko.designPatterns.solutions.facade;
/*Task description is in the Client class*/
import java.util.*;

public class Foreman {
	List<ConstructionalWorker> workers;
	boolean orderIsPrepared = false;
	Foreman(List<ConstructionalWorker> workers) {
		this.workers = workers;
	}
	void completePreparations() {
		System.out.println("Foreman is fulfilling all computations, buying construction materials and completing other preparations");
		orderIsPrepared = true;
	}
	void distributeWork() {
		System.out.println("Foreman gives parts of work to everyone");
		for(ConstructionalWorker worker : workers) {
			worker.doWork();
		}
	}
}
