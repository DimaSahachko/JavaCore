package main.java.com.DimaSahachko.designPatterns.examples.visitor;

public class Project implements ProjectElement {
	ProjectElement[] project;

	public Project() {
		this.project = new ProjectElement[] {
				new ProjectClass(),
				new Database(),
				new Test()
		};
	}

	@Override
	public void beWritten(Developer developer) {
		for(ProjectElement element : project) {
			element.beWritten(developer);
		}
	}
	
}
