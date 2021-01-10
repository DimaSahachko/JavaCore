package main.java.com.DimaSahachko.designPatterns.solutions.chainOfResponsibility;
/*We have an examine committee which consists of 4 examinators. Each examinator assesses different part of exam
 * (such as reading, speaking, listening, grammar). They do it  in turn. If current mark of student (which is average mark)
 * is less then 40, so this student is consider to fail the exam.
 * Examinator class is abstract and each examinator is its concrete realization. Client class (Exam) interact with 
 * examinators through their interface (abstract class Examinator). */ 
public class Exam {

	public static void main(String[] args) {
		Student student1 = new Student("Bob");
		Student student2 = new Student("Jack");
		
		Examinator grammar = new GrammarExaminator();
		Examinator reading = new ReadingExaminator();
		Examinator listening = new ListeningExaminator();
		Examinator speaking = new SpeakingExaminator();
		grammar.setNextExaminator(reading);
		reading.setNextExaminator(listening);
		listening.setNextExaminator(speaking);
		
		grammar.examine(student1);
		grammar.examine(student2);
	}

}
