package main.java.com.DimaSahachko.designPatterns.solutions.strategy;
/*Task description is in the DeveloperRunner class*/
public class IndoorRestBehavior implements RestBehavior {

	@Override
	public void spendRestTime() {
		System.out.println("Reading books...");
	}
	
}
