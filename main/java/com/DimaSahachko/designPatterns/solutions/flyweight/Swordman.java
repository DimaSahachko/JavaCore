package main.java.com.DimaSahachko.designPatterns.solutions.flyweight;
/* Task description is in the Draft class*/
public class Swordman extends Warrior {
	Weapon weapon = Weapon.SWORD;
	
	@Override
	void attack() {
		System.out.println("Attacking an enemy with sword");
	}
}
