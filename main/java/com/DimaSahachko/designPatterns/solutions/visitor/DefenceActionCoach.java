package main.java.com.DimaSahachko.designPatterns.solutions.visitor;
/*Task description is in the Workout class*/
public class DefenceActionCoach implements Coach {

	@Override
	public void train(Boxer boxer) {
		System.out.println("Work on dodges and blocks");
	}

	@Override
	public void train(FootballPlayer footballPlayer) {
		System.out.println("Work on defence combinations");
	}

	@Override
	public void train(BasketballPlayer basketballPlayer) {
		System.out.println("Work on individual defence");
	}
	
}
