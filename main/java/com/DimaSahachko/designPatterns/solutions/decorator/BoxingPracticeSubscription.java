package main.java.com.DimaSahachko.designPatterns.solutions.decorator;
/*Task description is in the GymClient class*/
public class BoxingPracticeSubscription extends SubscriptionDecorator {
 
	public BoxingPracticeSubscription(Subscription subscription) {
		super(subscription);
	}

	@Override
	public String getDescription() {
		
		return subs.getDescription() + "\nYou may attend boxing practice twice a week.";
	}

	@Override
	public double getCost() {
		
		return subs.getCost() + 200;
	}
	
}
