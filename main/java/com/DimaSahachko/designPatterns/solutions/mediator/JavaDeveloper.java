package main.java.com.DimaSahachko.designPatterns.solutions.mediator;
/*Task description is in the ProjectRuner class*/
public class JavaDeveloper implements Developer {
	GitHub git;
	String name;
	String projectSourceCode = "";
	String yourChanges;
	public JavaDeveloper(GitHub git, String name) {
		super();
		this.git = git;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void writeCode(String code) {
		yourChanges = code;
	}
	@Override
	public void push() {
		git.update(yourChanges, this);
	}
	@Override
	public void pull() {
		projectSourceCode = git.sendCode();
		System.out.println(getName() + " Upadating the code");
	}
	
}
