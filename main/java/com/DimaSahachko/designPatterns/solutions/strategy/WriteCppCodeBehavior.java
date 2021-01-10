package main.java.com.DimaSahachko.designPatterns.solutions.strategy;
/*Task description is in the DeveloperRunner class*/
public class WriteCppCodeBehavior implements WriteCodeBehavior {

	@Override
	public void writeCode() {
		System.out.println("Write c++ code...");
	}
	
}
