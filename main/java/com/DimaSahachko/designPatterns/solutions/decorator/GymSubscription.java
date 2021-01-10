package main.java.com.DimaSahachko.designPatterns.solutions.decorator;
/*Task description is in the GymClient class*/
public class GymSubscription implements Subscription {

	@Override
	public String getDescription() {
		
		return "You have unlimited subscription on our gym (weight equipment).";
	}

	@Override
	public double getCost() {
		
		return 300;
	}
	
}
