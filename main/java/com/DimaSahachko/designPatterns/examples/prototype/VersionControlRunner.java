package main.java.com.DimaSahachko.designPatterns.examples.prototype;

public class VersionControlRunner {

	public static void main(String[] args) {
		Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();");
		System.out.println(master);
		
		ProjectFactory factory = new ProjectFactory(master);
		Project copyProject = factory.cloneProject();
		System.out.println("/n=============/n");
		System.out.println(copyProject);
		
	}
	

}
