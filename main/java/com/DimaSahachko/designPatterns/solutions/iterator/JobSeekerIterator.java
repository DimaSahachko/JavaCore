package main.java.com.DimaSahachko.designPatterns.solutions.iterator;
/*Task description is in the Runner class*/
public interface JobSeekerIterator {
	boolean isDone();
	void next();
	Award current();
}
