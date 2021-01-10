package main.java.com.DimaSahachko.designPatterns.solutions.strategy;
/*Task description is in the DeveloperRunner class*/
public class Developer {
	WriteCodeBehavior codeWriting;
	RestBehavior restTime;
	TrainingBehavior training;
	
	public Developer(WriteCodeBehavior codeWriting, RestBehavior restTime, TrainingBehavior training) {
		super();
		this.codeWriting = codeWriting;
		this.restTime = restTime;
		this.training = training;
	}

	public void setCodeWriting(WriteCodeBehavior codeWriting) {
		this.codeWriting = codeWriting;
	}

	public void setRest(RestBehavior restTime) {
		this.restTime = restTime;
	}

	public void setTraining(TrainingBehavior training) {
		this.training = training;
	}
	
	public void writeCode() {
		codeWriting.writeCode();
	}
	public void rest() {
		restTime.spendRestTime();
	}
	public void training() {
		training.workout();
	}
	
}	
