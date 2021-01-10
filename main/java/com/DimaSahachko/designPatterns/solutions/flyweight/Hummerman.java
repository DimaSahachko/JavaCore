package main.java.com.DimaSahachko.designPatterns.solutions.flyweight;
/* Task description is in the Draft class*/
public class Hummerman extends Warrior {
	Weapon weapon = Weapon.HUMMER;
	
	@Override
	void attack() {
		System.out.println("Attacking an enemy with hummer");
	}
}
