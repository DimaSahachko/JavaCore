package main.java.com.DimaSahachko.designPatterns.solutions.visitor;
/*Task description is in the Workout class*/
public interface Coach {
	void train(Boxer boxer);
	void train(FootballPlayer footballPlayer);
	void train(BasketballPlayer basketballPlayer);
}
