package main.java.com.DimaSahachko.designPatterns.examples.composite;
import java.util.*;
public class Team {
	private List<Developer> developers = new ArrayList<>();
	public void addDeveloper(Developer developer) {
		developers.add(developer);
	}
	public void removeDeveloper(Developer developer) {
		developers.remove(developer);
	}
	public void createProject() {
		System.out.println("Team crates project... \n");
		for(Developer dev : developers) {
			dev.writeCode();
		}
	}
}
