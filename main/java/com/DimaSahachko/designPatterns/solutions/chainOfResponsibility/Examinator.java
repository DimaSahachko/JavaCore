package main.java.com.DimaSahachko.designPatterns.solutions.chainOfResponsibility;
/*Task description is in the Exam class*/
public abstract class Examinator {
	private Examinator nextExaminator;

	public void setNextExaminator(Examinator nextExaminator) {
		this.nextExaminator = nextExaminator;
	}
	
	public void examine(Student student) {
		if(student.getCurrentMark() == 0 || student.getCurrentMark() >= 40) {
			assess(student);
			if(student.getCurrentMark() < 40) {
				System.out.println(student.name + " you've failed the exam. Try later");
			}
			else {
				System.out.println(student.name + " your current totally mark is: " + student.getCurrentMark() + "/100");
			}
		}
		if(nextExaminator != null) {
			nextExaminator.examine(student);
		}
	}
	
	abstract public void assess(Student student);
}
