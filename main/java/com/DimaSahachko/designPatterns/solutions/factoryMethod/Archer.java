package main.java.com.DimaSahachko.designPatterns.solutions.factoryMethod;
/*Task description is in the FactoryMethod class*/
public class Archer extends Enemy {
	Archer() {
		type = "Archer";
		health = 100;
		range = 10;
		damage = 10;
		defence = 10;
		weapon = "Bow and arrow";
	}
	public void defence() {
		System.out.println("Evade from attack");
	}
}