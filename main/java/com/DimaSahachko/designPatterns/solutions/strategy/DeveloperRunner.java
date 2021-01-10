package main.java.com.DimaSahachko.designPatterns.solutions.strategy;
/*We have a developer class. There are three type of behavior which developer instances can do. You inject initially behavior
 * through the constructor and then to change the behavior you use setters. We don't need to change the developer class if we want
 * to add some new behavior (we only need to create new subtype for existing behavior). 
 * The client class (who invokes developer's methods) can inject different behaviors on the fly at runtime*/
public class DeveloperRunner {

	public static void main(String[] args) {
		Developer dev = new Developer(new WriteJavaCodeBehavior(), new IndoorRestBehavior(), new BoxingBehavior());
		System.out.println("MONDAY");
		dev.writeCode();
		dev.training();
		dev.rest();
		System.out.println("TUESDAY");
		dev.setRest(new SociallyRestBehavior());
		dev.setTraining(new GymBehavior());
		
		dev.writeCode();
		dev.training();
		dev.rest();
		System.out.println("WEDNSDAY");
		dev.setCodeWriting(new WriteCppCodeBehavior());
		dev.setRest(new IndoorRestBehavior());
		dev.setTraining(new BoxingBehavior());
		
		dev.writeCode();
		dev.training();
		dev.rest();
	}

}
