package main.java.com.DimaSahachko.designPatterns.solutions.factoryMethod;
/*Task description is in the FactoryMethod class*/
public class Swordman extends Enemy {
	Swordman() {
		type = "Swordman";
		health = 100;
		range = 2;
		damage = 15;
		defence = 15;
		weapon = "sword";
	}
	public void defence() {
		System.out.println("Block by sword");
	}
}