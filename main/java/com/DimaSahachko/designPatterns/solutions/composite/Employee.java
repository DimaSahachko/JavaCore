package main.java.com.DimaSahachko.designPatterns.solutions.composite;
/* Task description is in the Client class*/
public class Employee implements WorkPerformer {
	String name;
	String work;
	Employee(String name, String work) {
		this.name = name;
		this.work = work;
	}

	@Override
	public void workOn() {
		System.out.println(name + " " + work);
	}
	@Override
	public void addPerformer(WorkPerformer unit) {
		System.out.println("Inappropriate operation");
	}
	
}
