package main.java.com.DimaSahachko.designPatterns.solutions.decorator;
/*Task description is in the GymClient class*/
public class PoolSubscription extends SubscriptionDecorator {
	
	public PoolSubscription(Subscription subscription) {
		super(subscription);
	}

	@Override
	public String getDescription() {
		return subs.getDescription() + "\nYou may attend swiming pool unlimited.";
	}

	@Override
	public double getCost() {
		
		return subs.getCost() + 200;
	}
	
}
