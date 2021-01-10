package main.java.com.DimaSahachko.designPatterns.examples.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {
	public SeniorJavaDeveloper(Developer developer) {
		super(developer);
	}
	public String makeCodeReview() {
		return " Make code reveiw.";
	}
	@Override
	public String doWork() {
		
		return super.doWork() + makeCodeReview();
	}
	
}
