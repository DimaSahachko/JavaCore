package main.java.com.DimaSahachko.designPatterns.solutions.templateMethod;
/*Task description is in the Client class*/
public abstract class LawyerFirm {
	public final void doWork() {
		welcomeClient();
		listenToProblem();
		sueStatementOfClaim();
		sueLegalCostsPetition();
		representInCourt();
	}
	
	public void welcomeClient() { //method with a concrete implementation in the abstract class
		System.out.println("Welcoming a client");
	}
	public void listenToProblem() { //method with a concrete implementation in the abstract class
		System.out.println("Listening to a problem");
	}
	public abstract void sueStatementOfClaim(); //abstract method which is going to be overridden in the subclasses
	
	public void sueLegalCostsPetition() { //hook method which may be or may not to be overridden in the subclasses
		
	}
	public abstract void representInCourt(); //abstract method which is going to be overridden in the subclasses
}
