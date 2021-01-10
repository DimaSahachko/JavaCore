package main.java.com.DimaSahachko.designPatterns.solutions.builder;
/*Task description is in the BuilderClient class*/
public class SmallForwardBuilder extends PlayerBuilder {
	public SmallForwardBuilder() {
		this.player = new Player();
	}
	
	@Override
	void createPosition() {
		player.setPosition(Position.SMALLFORWARD);

	}

	@Override
	void createHeight() {
		player.setHeight(random.nextInt((210 - 190) + 1) + 190);
	}

	@Override
	void createEndurance() {
		player.setEndurance(random.nextInt((10 - 5) + 1) + 5);
	}

	@Override
	void createAccuracy() {
		player.setAccuracy(random.nextInt((10 - 1) + 1) + 1);
	}
	
}
