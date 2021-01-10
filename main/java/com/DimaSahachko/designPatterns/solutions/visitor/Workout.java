package main.java.com.DimaSahachko.designPatterns.solutions.visitor;
/*We have different types of athletes with common interface - Sportsman. This interface define method - practice() which take an argument
 * of type Coach and call the method train() on that coach. Depending on concrete coach implementation (we have two in our example)
 * we result in different behavior. That means we can change the behavior without changing "sportsmans" classes.
 * When concrete implementation of sportsman invoke coaches method train() it pass a this reference to this method; 
 *  */
public class Workout {

	public static void main(String[] args) {
		Sportsman boxer = new Boxer();
		Sportsman footballPlayer = new FootballPlayer();
		Sportsman basketballPlayer = new BasketballPlayer();
		Coach attackCoach = new AttackActionCoach();
		Coach defenceCoach = new DefenceActionCoach();
		
		boxer.practice(attackCoach);
		footballPlayer.practice(attackCoach);
		basketballPlayer.practice(attackCoach);
		System.out.println("\n===============\n");
		boxer.practice(defenceCoach);
		footballPlayer.practice(defenceCoach);
		basketballPlayer.practice(defenceCoach);
	}

}
