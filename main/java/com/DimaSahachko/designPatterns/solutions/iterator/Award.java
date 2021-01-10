package main.java.com.DimaSahachko.designPatterns.solutions.iterator;
/*Task description is in the Runner class*/
public class Award {
	String name;
	int yearOfReceiving;
	public Award(String name, int yearOfReceiving) {
		super();
		this.name = name;
		this.yearOfReceiving = yearOfReceiving;
	}
	@Override
	public String toString() {
		return name + ", yearOfReceiving = " + yearOfReceiving;
	}
	
}
