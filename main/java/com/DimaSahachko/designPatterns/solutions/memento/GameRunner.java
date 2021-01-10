package main.java.com.DimaSahachko.designPatterns.solutions.memento;
/*Lets suppose that we have a computer game. Our main character has different stats like power, agility etc.
 * After our level being up and getting free points to improve our stats we definitely will want to do it.
 * But we may do it in unreasonable fashion and we may not to like our improvement and probably we will want
 * to get back to the previous state.
 * An inner class Save is our memento where we store our saves. A History class is a kind of "caretaker"
 * and we use for storing our saves and getting them.
 * */
public class GameRunner {

	public static void main(String[] args) {
		Hero ourHero = new Hero();
		History hist = new History();
		System.out.println(ourHero);
		
		ourHero.powerUp();	//increasing out initial stats;
		ourHero.powerUp();
		ourHero.accuracyUp();
		ourHero.accuracyUp();
		ourHero.intellectUp();
		System.out.println(ourHero);
		
		hist.accept(ourHero.save("Lvl1")); //saving
		
		ourHero.levelUp(); //lvl up and getting new free points to stats;
		
		for(int x = 0; x < 5; x++) //increasing power 5 times
			ourHero.powerUp();
		System.out.println(ourHero);
		
		ourHero.rollBack(hist.getSaving()); //we don't like our latest improvement so we want to get back to the previous state
		System.out.println(ourHero);
	}	

}
