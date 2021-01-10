package main.java.com.DimaSahachko.designPatterns.solutions.mediator;
/*Task description is in the ProjectRuner class*/
import java.util.*;
public class RealGitHub implements GitHub {
	String projectSourceCode = "";
	List<Developer> developers = new ArrayList<>();
	
	void addDeveloper(Developer developer) {
		developers.add(developer);
	}
	
	public String getProjectSourceCode() {
		return projectSourceCode;
	}
	
	@Override
	public void update(String code, Developer author) {
		projectSourceCode += code + " ";
		for(Developer dev : developers) {
			if(dev == author) {
				continue;
			}
			dev.pull();
		}
	}
	@Override
	public String sendCode() {
		return projectSourceCode;
	}
	
}
