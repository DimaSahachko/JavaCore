package main.java.com.DimaSahachko.designPatterns.examples.visitor;

public class Database implements ProjectElement {

	@Override
	public void beWritten(Developer developer) {
		developer.create(this);
	}
	
}
