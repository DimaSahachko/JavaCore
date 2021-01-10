package main.java.com.DimaSahachko.designPatterns.solutions.builder;
/*Task description is in the BuilderClient class*/
public class CentreBuilder extends PlayerBuilder {
	public CentreBuilder() {
		this.player = new Player();
	}
	
	@Override
	void createPosition() {
		player.setPosition(Position.CENTRE);
	}

	@Override
	void createHeight() {
		player.setHeight(random.nextInt((225 - 200) + 1) + 200);
	}

	@Override
	void createEndurance() {
		player.setEndurance(random.nextInt((10 - 1) + 1) + 1);
	}

	@Override
	void createAccuracy() {
		player.setAccuracy(random.nextInt((10 - 1) + 1) + 1);
	}
}
