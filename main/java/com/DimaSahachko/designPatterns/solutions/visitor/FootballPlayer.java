package main.java.com.DimaSahachko.designPatterns.solutions.visitor;
/*Task description is in the Workout class*/
public class FootballPlayer implements Sportsman {

	@Override
	public void practice(Coach coach) {
		coach.train(this);
	}

}
