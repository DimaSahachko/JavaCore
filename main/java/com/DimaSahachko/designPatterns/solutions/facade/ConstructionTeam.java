package main.java.com.DimaSahachko.designPatterns.solutions.facade;
/*Task description is in the Client class*/
import java.util.*;

public class ConstructionTeam {
	Foreman master;
	void carryOutAnOrder() {
		List<ConstructionalWorker> workers = new ArrayList<ConstructionalWorker>();
		ConstructionalWorker bricklayer = new Bricklayer();
		ConstructionalWorker roofer = new Roofer();
		ConstructionalWorker handyMan1 = new GeneralWorker();
		ConstructionalWorker handyMan2 = new GeneralWorker();
		workers.add(bricklayer);
		workers.add(roofer);
		workers.add(handyMan1);
		workers.add(handyMan2);
		master = new Foreman(workers);
		master.completePreparations();
		master.distributeWork();
	}
}
