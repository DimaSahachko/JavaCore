package main.java.com.DimaSahachko.designPatterns.solutions.factoryMethod;
/*Task description is in the FactoryMethod class*/
import java.util.Random;

public class RandomEnemyFactory implements EnemyFactory {
	public Enemy createAnEnemy(int level) {
		Enemy enemy;
		Random random = new Random();
		int r = random.nextInt(3);
		if(r == 0) {
			enemy = new Horseman();
		} else if (r == 1) {
			enemy = new Swordman();
		} else {
			enemy = new Archer();
		}
		enemy.damage *= level;
		enemy.defence *= level;
		enemy.health *= level;
		return enemy;
	}
}