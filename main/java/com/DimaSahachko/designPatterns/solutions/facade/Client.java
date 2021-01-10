package main.java.com.DimaSahachko.designPatterns.solutions.facade;
/*We have a builders team which consists of Foreman and a bunch of different workers. Every worker carries they part of work.
 * But firstly a foreman has to carry out all preparations: different computations, purchasing things, negotiations with an orderer etc.
 * Then he can distribute part of work between his workers.
 * In order to simplify instantiation of all workers and interaction between them in client's code we create a class
 * that does all this stuff for us - ConstructionTeam*/ 
public class Client {

	public static void main(String[] args) {
		ConstructionTeam builders = new ConstructionTeam();
		builders.carryOutAnOrder();
	}

}
