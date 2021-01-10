package main.java.com.DimaSahachko.designPatterns.solutions.strategy;
/*Task description is in the DeveloperRunner class*/
public class WriteJavaCodeBehavior implements WriteCodeBehavior {

	@Override
	public void writeCode() {
		System.out.println("Write Java code...");
	}
	
}
