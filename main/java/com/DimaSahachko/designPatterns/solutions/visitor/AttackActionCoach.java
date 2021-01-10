package main.java.com.DimaSahachko.designPatterns.solutions.visitor;
/*Task description is in the Workout class*/
public class AttackActionCoach implements Coach {

	@Override
	public void train(Boxer boxer) {
		System.out.println("Work on jabs, hooks, appercuts");
	}

	@Override
	public void train(FootballPlayer footballPlayer) {
		System.out.println("Work on shots");
	}

	@Override
	public void train(BasketballPlayer basketballPlayer) {
		System.out.println("Work on attack combinations");
	}
	
}
