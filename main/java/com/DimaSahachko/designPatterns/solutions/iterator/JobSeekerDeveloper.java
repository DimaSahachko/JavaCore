package main.java.com.DimaSahachko.designPatterns.solutions.iterator;
/*Task description is in the Runner class*/
import java.util.*;
public class JobSeekerDeveloper implements JobSeeker {
	String name;
	int age;
	List<Award> awards;
	public JobSeekerDeveloper(String name, int age, List<Award> awards) {
		super();
		this.name = name;
		this.age = age;
		this.awards = awards;
	}
	@Override
	public JobSeekerIterator getIterator() {
		return new JobSeekerDeveloperIterator(awards);
	}	
}
