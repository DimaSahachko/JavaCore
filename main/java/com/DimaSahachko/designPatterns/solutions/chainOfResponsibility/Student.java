package main.java.com.DimaSahachko.designPatterns.solutions.chainOfResponsibility;
/*Task description is in the Exam class*/
public class Student {
	int currentMark = 0;
	String name;
	
	Student(String name) {
		this.name = name;
	}
	public int getCurrentMark() {
		return currentMark;
	}

	public void setCurrentMark(int mark) {
		this.currentMark = mark;
	}
	
}
