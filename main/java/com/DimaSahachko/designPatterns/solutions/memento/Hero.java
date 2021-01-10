package main.java.com.DimaSahachko.designPatterns.solutions.memento;
/*Task description is in the GameRunner state*/
public class Hero {
	private int power = 5;
	private int agility = 5;
	private int accuracy = 5;
	private int intellect = 5;
	private int freePoints = 5;
	private int level = 1;

	void powerUp(){
		if(freePoints > 0) {
			power++;
			freePoints--;
		}
	}
	void agilityUp() {
		if(freePoints > 0) {
			agility++;
			freePoints--;
		}
	}
	void accuracyUp() {
		if(freePoints > 0) {
			accuracy++;
			freePoints--;
		}
	}
	void intellectUp() {
		if(freePoints > 0) {
			intellect++;
			freePoints--;
		}
	}
	void levelUp() {
		level++;
		freePoints += 5;
	}
	public Save save(String version) {
		return new Save(version, power, agility, accuracy, intellect, freePoints, level);
	}
	
	void rollBack(Save save) {
		power = save.getPower();
		agility = save.getAgility();
		accuracy = save.getAccuracy();
		intellect = save.getIntellect();
		freePoints = save.getFreePoints();
		level = save.getLevel();
	}
	@Override
	public String toString() {
		return "Hero [power=" + power + ", agility=" + agility + ", accuracy=" + accuracy + ", intellect=" + intellect
				+ ", freePoints=" + freePoints + ", level=" + level + "]";
	}
	
	public class Save {
		String version;
		private final int power;
		private final int agility;
		private final int accuracy;
		private final int intellect;
		private final int freePoints;
		private final int level;
		
		public Save(String version, int power, int agility, int accuracy, int intellect, int freePoints, int level) {
			super();
			this.version = version;
			this.power = power;
			this.agility = agility;
			this.accuracy = accuracy;
			this.intellect = intellect;
			this.freePoints = freePoints;
			this.level = level;
		}

		public int getPower() {
			return power;
		}

		public int getAgility() {
			return agility;
		}

		public int getAccuracy() {
			return accuracy;
		}

		public int getIntellect() {
			return intellect;
		}

		public int getFreePoints() {
			return freePoints;
		}

		public int getLevel() {
			return level;
		}
	}
}
