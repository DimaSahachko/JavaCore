package main.java.com.DimaSahachko.designPatterns.solutions.decorator;
/*Let's assume that we have a fitness center with different type of subscriptions. The basic type is GymSubscription and additionally
 * you will perhaps want to get other services like swimming pool, yoga or boxing practices.
 * Our application will give a description of your personal type of subscription and return a total price.*/
public class GymClient {

	public static void main(String[] args) {
		Subscription mySubs = new GymSubscription();
		mySubs = new BoxingPracticeSubscription(mySubs);
		mySubs = new YogaSubscription(mySubs);
		mySubs = new PoolSubscription(mySubs);
		System.out.println("Total price is - " + mySubs.getCost());
		System.out.println(mySubs.getDescription());
	}	

}
