package main.java.com.DimaSahachko.designPatterns.examples.visitor;

public class ProjectRunner {

	public static void main(String[] args) {
		Project project = new Project();
		Developer junior = new JuniorDeveloper();
		Developer senior = new SeniorDeveloper();
		project.beWritten(junior);
		System.out.println("\n==================\n");
		project.beWritten(senior);
		
	}

}
