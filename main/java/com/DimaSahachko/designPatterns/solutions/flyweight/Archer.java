package main.java.com.DimaSahachko.designPatterns.solutions.flyweight;
/* Task description is in the Draft class*/
public class Archer extends Warrior {
	Weapon weapon = Weapon.BOW;
	
	@Override
	void attack() {
		System.out.println("Attacking an enemy with bow");
	}
}
