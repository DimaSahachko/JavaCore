package main.java.com.DimaSahachko.designPatterns.solutions.builder;
/*Task description is in the BuilderClient class*/
public class Player {
	private Position position;
	private int height;
	private int endurance;
	private int accuracy;
	
	public void setPosition(Position position) {
		this.position = position;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	@Override
	public String toString() {
		return "Player [position=" + position + ", height=" + height + ", endurance=" + endurance + ", accuracy="
				+ accuracy + "]";
	}
	
}
