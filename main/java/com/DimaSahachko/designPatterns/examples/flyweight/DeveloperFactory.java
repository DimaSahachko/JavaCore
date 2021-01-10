package main.java.com.DimaSahachko.designPatterns.examples.flyweight;
import java.util.*;
public class DeveloperFactory {
	Map<String, Developer> developers = new HashMap<>();
	Developer getDeveloper(String specialty) {
		Developer dev = developers.get(specialty);
		if(dev == null) {
			switch(specialty) {
				case "java":
					System.out.println("Hiring Java developer");
					dev = new JavaDeveloper();
					break;
				case "cpp":
					System.out.println("Hiring Cpp developer");
					dev = new CppDeveloper();
					break;
			}
			developers.put(specialty, dev);
		}
		return dev;		
	}
}
