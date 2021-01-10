package main.java.com.DimaSahachko.designPatterns.solutions.factoryMethod;
/*Task description is in the FactoryMethod class*/
public abstract class Enemy {
	String type;
	int health;
	int range;
	int damage;
	int defence;
	String weapon;
	
	public String toString() {
		return type + ": health - " + health + ", range - " + range + ", damage - " + damage + ", defence - " + defence + ". My weapon - " + weapon;
	}
	void attack() {
		System.out.println("Attacking a character");
	}
	abstract void defence();
	void chase() {
	 System.out.println("I'll catch you");
	}
	void fleeAway() {
		System.out.println("Leave me alone");
	}
	
}