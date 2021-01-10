package main.java.com.DimaSahachko.designPatterns.solutions.builder;
/* Let's assume that we are creating basketball simulator game and we are about to create basketball players;
 *  All players have a certain set of typical parameters (like position, accuracy, height etc)
 *  so we can use a builder pattern to create each player.
 *  We will create several builders to create different players;
 *  We will set random value within a certain range to each parameter*/
public class BuilderClient {

	public static void main(String[] args) {
		Director director = new Director();
		PlayerBuilder guardPB = new ShootingGuardBuilder();
		PlayerBuilder centrePB = new CentreBuilder();
		PlayerBuilder forwardPB = new SmallForwardBuilder();
		
		director.setBuilder(guardPB);
		Player player1 = director.constructPlayer();
		director.setBuilder(centrePB);
		Player player2 = director.constructPlayer();
		director.setBuilder(forwardPB);
		Player player3 = director.constructPlayer();
		
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
	}
}
