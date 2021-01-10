package main.java.com.DimaSahachko.designPatterns.examples.visitor;

public interface Developer {
	void create(ProjectClass projectClass);
	void create(Database database);
	void create(Test test);
}
