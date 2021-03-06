package main.java.com.DimaSahachko.designPatterns.solutions.prototype;
/*Task description is in the Army class*/
public class Pikeman implements Copyable {
	private int health;
	private int attackSpeed;
	private int range;
	String weapon;
	public Pikeman(int health, int attackSpeed, int range, String weapon) {
		this.health = health;
		this.attackSpeed = attackSpeed;
		this.range = range;
		this.weapon = weapon;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getAttackSpeed() {
		return attackSpeed;
	}
	public void setAttackSpeed(int attackSpeed) {
		this.attackSpeed = attackSpeed;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	@Override
	public String toString() {
		return "Pikeman [health=" + health + ", attackSpeed=" + attackSpeed + ", range=" + range + ", weapon=" + weapon
				+ "] " + hashCode();
	}
	@Override
	public Object copy() {
		Pikeman copy = new Pikeman(health, attackSpeed, range, weapon);
		return copy;
	}
	
	

}
