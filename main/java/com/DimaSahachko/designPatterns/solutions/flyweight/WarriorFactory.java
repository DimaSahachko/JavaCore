package main.java.com.DimaSahachko.designPatterns.solutions.flyweight;
/* Task description is in the Draft class*/
import java.util.*;
public class WarriorFactory {
	Map<Weapon, Warrior> warriors = new HashMap<>();
	Warrior getWarrior(Weapon weapon) {
		Warrior warrior = warriors.get(weapon);
		if(warrior == null) {
			switch(weapon) {
			case BOW:
				System.out.println("Creating an archer");
				warrior = new Archer();
				break;
			case SWORD:
				System.out.println("Creating an swordman");
				warrior = new Swordman();
				break;
			case HUMMER:
				System.out.println("Creating an hummerman");
				warrior = new Hummerman();
				break;				
			}
			warriors.put(weapon, warrior);
		}
		return warrior;
	}
}
