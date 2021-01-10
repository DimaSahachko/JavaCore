package main.java.com.DimaSahachko.designPatterns.solutions.builder;
/*Task description is in the BuilderClient class*/
import java.util.Random;

public abstract class PlayerBuilder {
	Player player;
	Random random = new Random();

	abstract void createPosition();
	abstract void createHeight();
	abstract void createEndurance();
	abstract void createAccuracy();
	
	Player getPlayer() {
		return player;
	}
}
