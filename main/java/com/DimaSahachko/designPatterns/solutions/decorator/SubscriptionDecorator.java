package main.java.com.DimaSahachko.designPatterns.solutions.decorator;
/*Task description is in the GymClient class*/
public abstract class SubscriptionDecorator implements Subscription{
	Subscription subs;
	public SubscriptionDecorator(Subscription subscription) {
		subs = subscription;
	}
}
