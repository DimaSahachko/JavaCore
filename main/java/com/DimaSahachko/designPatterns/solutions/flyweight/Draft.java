package main.java.com.DimaSahachko.designPatterns.solutions.flyweight;
/*We created an abstract class Warrior and three subclasses each of which overrides method attack() and uses different types of weapon.
 * Then we created a simple factory of these warriors and always return the same instance (if we have one) by this factory.
 * If we don't then we create one.
 * So instead of creating tons of new objects we can reuse those that we already have. */
import java.util.*;
public class Draft {

	public static void main(String[] args) {
		List<Warrior> army = new ArrayList<>();
		WarriorFactory factory = new WarriorFactory();
		army.add(factory.getWarrior(Weapon.BOW));
		army.add(factory.getWarrior(Weapon.BOW));
		army.add(factory.getWarrior(Weapon.BOW));
		army.add(factory.getWarrior(Weapon.SWORD));
		army.add(factory.getWarrior(Weapon.SWORD));
		army.add(factory.getWarrior(Weapon.SWORD));
		army.add(factory.getWarrior(Weapon.HUMMER));
		army.add(factory.getWarrior(Weapon.HUMMER));
		army.add(factory.getWarrior(Weapon.HUMMER));
		for(Warrior unit : army) {
			unit.attack();
		}

	}

}
