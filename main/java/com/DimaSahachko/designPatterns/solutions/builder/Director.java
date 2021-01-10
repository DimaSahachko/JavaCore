package main.java.com.DimaSahachko.designPatterns.solutions.builder;
/*Task description is in the BuilderClient class*/
public class Director {
	PlayerBuilder builder;

	public void setBuilder(PlayerBuilder builder) {
		this.builder = builder;
	}

	Player constructPlayer() {
		builder.createPosition();
		builder.createHeight();
		builder.createEndurance();
		builder.createAccuracy();
		return builder.getPlayer();
	}
}
