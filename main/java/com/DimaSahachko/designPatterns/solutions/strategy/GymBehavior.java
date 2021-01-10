package main.java.com.DimaSahachko.designPatterns.solutions.strategy;
/*Task description is in the DeveloperRunner class*/
public class GymBehavior implements TrainingBehavior {

	@Override
	public void workout() {
		System.out.println("Training in the gym...");
	}
	
}
