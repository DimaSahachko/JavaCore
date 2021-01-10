package main.java.com.DimaSahachko.designPatterns.examples.bridge;

public abstract class Program {
	Developer developer;
	protected Program( Developer dev) {
		developer = dev;
	}
	public abstract void developProgram();
}
