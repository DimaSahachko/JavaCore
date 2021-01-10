package main.java.com.DimaSahachko.designPatterns.solutions.builder;
/*Task description is in the BuilderClient class*/
public class ShootingGuardBuilder extends PlayerBuilder {
	ShootingGuardBuilder() {
		this.player = new Player();
	}
	@Override
	void createPosition() {
		player.setPosition(Position.SHOOTINGGUARD);
	}

	@Override
	void createHeight() {
		player.setHeight(random.nextInt((200 - 185) + 1) + 185);
	}

	@Override
	void createEndurance() {
		player.setEndurance(random.nextInt((10 - 1) + 1) + 1);
	}

	@Override
	void createAccuracy() {
		player.setAccuracy(random.nextInt((10 - 5) + 1) + 5);
	}
	
}
