package main.java.com.DimaSahachko.designPatterns.solutions.prototype;
/*Task description is in the Army class*/
public class SoldierFactory {
	Pikeman pikeman;
	Swordman swordman;
	SoldierFactory() {
		pikeman = new Pikeman(100, 3, 5, "Long pike");
		swordman = new Swordman(150, 5, 3, "One-hand sword");
	}
	public void setPikeman(Pikeman pikeman) {
		this.pikeman = pikeman;
	}
	public void setSwordman(Swordman swordman) {
		this.swordman = swordman;
	}
	Pikeman copyPikeman() {
		return (Pikeman) pikeman.copy();
	}
	Swordman copySwordman() {
		return (Swordman) swordman.copy();
	}
}	
