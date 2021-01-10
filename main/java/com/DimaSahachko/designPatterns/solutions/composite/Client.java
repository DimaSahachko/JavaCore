package main.java.com.DimaSahachko.designPatterns.solutions.composite;
/* Let's assume that we create a team that is going to work on application for bank. This team has a branch structure.
 * It is comprised of smaller teams and single workers. Each smaller team in its turn is comprised of
 * either even smaller teams or single workers or mix of both. And we want to know what each team and worker works on.
 * In order to resolve our task effectively both team and single employees implements the same interface. It gives us
 * an opportunity to treat them in the same way.*/
public class Client {

	public static void main(String[] args) {
		WorkPerformer projectTeam = new Team("BankSystemCreators", "Create application for bank"); //we create the main team;
		
		WorkPerformer redTeam = new Team("Red team", "develop application for internal using"); //create two subteam "of first level"
		WorkPerformer greenTeam = new Team("Green team", "develop online banking system"); //in order to add them to our main team
		
		projectTeam.addPerformer(new Employee("Jack", "Manage the project")); //add subteams and independent employees to our main team
		projectTeam.addPerformer(redTeam);
		projectTeam.addPerformer(greenTeam);
		projectTeam.addPerformer(new Employee("Tom", "Collect feedback from users for all project team"));
		
		WorkPerformer redSubTeamA = new Team("Red subteam A", "develop front-end of application"); //red subtem will contain two subteams too
		WorkPerformer redSubTeamB = new Team("Red subteam B", "develop back-end of application");
		
		redTeam.addPerformer(redSubTeamA); //add two subtems to red team and an independent employee
		redTeam.addPerformer(redSubTeamB);
		redTeam.addPerformer(new Employee("Jack", "comunicate with client in red team"));
		
		redSubTeamA.addPerformer(new Employee("Anton", "make part of work 1 in red subteam A")); //red SubTeamA consists of two employees
		redSubTeamA.addPerformer(new Employee("Nick", "make part of work 2 in red subteam A"));
		
		redSubTeamB.addPerformer(new Employee("Jordan", "make part of work 1 in red subteam B"));//red SubTeamB consists of two employees
		redSubTeamB.addPerformer(new Employee("Bogdan", "make part of work 2 in red subteam B"));
		
		greenTeam.addPerformer(new Employee("Carlos", "make part of work 1 in green team"));//green team consists of two employees
		greenTeam.addPerformer(new Employee("Andrew", "make part of work 2 in green team"));
		
		projectTeam.workOn(); //call the method that informs us about work each worker and team are working on
		
	}

}
