package main.java.com.DimaSahachko.designPatterns.solutions.factoryMethod;
/*Task description is in the FactoryMethod class*/
public class Horseman extends Enemy {
	Horseman() {
		type = "Horseman";
		health = 100;
		range = 5;
		damage = 30;
		defence = 30;
		weapon = "pike and shield";
	}
	public void defence() {
		System.out.println("Hide behind a shield");
	}
}
