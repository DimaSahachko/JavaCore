package main.java.com.DimaSahachko.designPatterns.examples.decorator;

public class DeveloperDecorator implements Developer {
	Developer developer;

	public DeveloperDecorator(Developer developer) {
		super();
		this.developer = developer;
	}

	@Override
	public String doWork() {
		
		return developer.doWork();
	}
	
}
