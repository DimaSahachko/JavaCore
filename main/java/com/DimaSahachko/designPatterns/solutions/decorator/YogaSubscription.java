package main.java.com.DimaSahachko.designPatterns.solutions.decorator;
/*Task description is in the GymClient class*/
public class YogaSubscription extends SubscriptionDecorator {
	
	public YogaSubscription(Subscription subscription) {
		super(subscription);
	}

	@Override
	public String getDescription() {
		return subs.getDescription() + "\nYou may attend yoga practice three times a week.";
	}

	@Override
	public double getCost() {
		
		return subs.getCost() + 150;
	}
	
}
