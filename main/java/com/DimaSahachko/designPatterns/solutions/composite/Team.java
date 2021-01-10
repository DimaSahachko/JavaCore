package main.java.com.DimaSahachko.designPatterns.solutions.composite;
/* Task description is in the Client class*/
import java.util.*;

public class Team implements WorkPerformer {
	private List<WorkPerformer> performers = new ArrayList<>(); 
	String name;
	String work;
	public Team(String name, String work) {
		super();
		this.name = name;
		this.work = work;
	}
	
	@Override
	public void workOn() {
		System.out.println(name + ": " + work);
		for(WorkPerformer unit : performers) {
		unit.workOn();
		}
	}
	@Override
	public void addPerformer(WorkPerformer unit) {
		performers.add(unit);
	}
	
}	
