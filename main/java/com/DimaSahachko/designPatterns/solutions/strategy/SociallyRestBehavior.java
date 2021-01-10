package main.java.com.DimaSahachko.designPatterns.solutions.strategy;
/*Task description is in the DeveloperRunner class*/
public class SociallyRestBehavior implements RestBehavior {

	@Override
	public void spendRestTime() {
		System.out.println("Spending time with friends...");
	}
	
}
