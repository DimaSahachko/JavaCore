package main.java.com.DimaSahachko.designPatterns.examples.decorator;

public class Task {

	public static void main(String[] args) {
		Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
		System.out.println(developer.doWork());
		Developer dev = new SeniorJavaDeveloper(new JavaTeamLead(new JavaDeveloper()));
		System.out.println(dev.doWork());
	}

}
