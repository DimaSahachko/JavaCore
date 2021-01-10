package main.java.com.DimaSahachko.designPatterns.examples.memento;

public class SaveProjectRunner {

	public static void main(String[] args) {
		Project project = new Project();
		GitHubRepo github = new GitHubRepo();
		System.out.println("Creating new project version 1.0");
		project.setVersionAndDate("Version 1.0");
		
		System.out.println(project);
		
		System.out.println("Saving current version to github");
		github.setSave(project.save());
		
		System.out.println("Updating project to version 1.1.");
		System.out.println("Writing poor code");
		
		project.setVersionAndDate("Version 1.1");
		
		System.out.println(project);
		
		System.out.println("Something went wrogn");
		
		System.out.println("Rolling back to version 1.0");
		project.load(github.getSave());
		
		System.out.println("Project after rollback:");
		System.out.println(project);
	}

}
