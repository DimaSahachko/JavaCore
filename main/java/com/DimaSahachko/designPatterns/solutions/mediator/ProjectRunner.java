package main.java.com.DimaSahachko.designPatterns.solutions.mediator;
/*Let's assume that we create a program which is alike Github. Developers can write code and then push it to the something like common
 * remote repozitory. When you push your updates this repozitory update the project source code 
 * makes other developers pull these latest updates to their "working directory".
 * The RealGitHub in this example is a mediator which helps objects to interact with each other without knowing anything about each other.  */
public class ProjectRunner {

	public static void main(String[] args) {
		RealGitHub gh = new RealGitHub();
		
		Developer developer1 = new JavaDeveloper(gh, "Developer1");
		Developer developer2 = new JavaDeveloper(gh, "Developer2");
		Developer developer3 = new JavaDeveloper(gh, "Developer3");
		gh.addDeveloper(developer1);
		gh.addDeveloper(developer2);
		gh.addDeveloper(developer3);
		
		developer1.writeCode("Code from developer 1");
		developer1.push();
		
		developer2.writeCode("Code from developer 2");
		developer2.push();
		
		System.out.println(gh.getProjectSourceCode());
	}
}
