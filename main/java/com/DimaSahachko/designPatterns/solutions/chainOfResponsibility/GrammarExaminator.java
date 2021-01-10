package main.java.com.DimaSahachko.designPatterns.solutions.chainOfResponsibility;
/*Task description is in the Exam class*/
public class GrammarExaminator extends Examinator {
	public void assess(Student student) {
		int mark = (int) (Math.random() * (100 - 1)) + 1;
		System.out.println(student.name + " you've got " + mark + "/100 for your grammar exam!");
		if(student.getCurrentMark() == 0) {
			student.setCurrentMark(mark);
		} else {
			student.setCurrentMark((student.getCurrentMark() + mark) / 2);
		}
	}
}
