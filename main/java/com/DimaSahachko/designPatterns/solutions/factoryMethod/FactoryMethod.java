package main.java.com.DimaSahachko.designPatterns.solutions.factoryMethod;
/* We have a computer game. There are a few levels each of which differs from the previous one by strength of enemies. 
 * There are also few types of enemies, which are created randomly by factory method.
 * We can simply add another concrete creator classes which will implement enemy factory interface and will provide different 
 * logic of creating enemies objects. For example, will create one definite type of enemy disregarding a game level.
 *   */
public class FactoryMethod {

	public static void main(String[] args) {
		EnemyFactory factory = new RandomEnemyFactory();
		Enemy firstEnemy = factory.createAnEnemy(1);
		Enemy secondEnemy = factory.createAnEnemy(3);
		System.out.println(firstEnemy);
		System.out.println(secondEnemy);
	}
}
