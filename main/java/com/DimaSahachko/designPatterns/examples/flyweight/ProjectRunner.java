package main.java.com.DimaSahachko.designPatterns.examples.flyweight;
import java.util.*;
public class ProjectRunner {

	public static void main(String[] args) {
		DeveloperFactory factory = new DeveloperFactory();
		List<Developer> list = new ArrayList<>();
		list.add(factory.getDeveloper("java"));
		list.add(factory.getDeveloper("java"));
		list.add(factory.getDeveloper("java"));
		list.add(factory.getDeveloper("java"));
		list.add(factory.getDeveloper("cpp"));
		list.add(factory.getDeveloper("cpp"));
		list.add(factory.getDeveloper("cpp"));
		list.add(factory.getDeveloper("cpp"));
		for(Developer dev : list) {
			dev.writeCode();
		}
	}

}
