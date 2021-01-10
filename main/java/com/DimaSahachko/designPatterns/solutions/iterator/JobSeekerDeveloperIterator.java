package main.java.com.DimaSahachko.designPatterns.solutions.iterator;
/*Task description is in the Runner class*/
import java.util.*;
public class JobSeekerDeveloperIterator implements JobSeekerIterator {
	List<Award> awards;
	int index;
	public JobSeekerDeveloperIterator(List<Award> awards) {
		this.awards = awards;
	}
	@Override
	public boolean isDone() {
		if(index < awards.size()) {
			return true;
		}
		return false;
	}

	@Override
	public void next() {
		index += 1;
	}

	@Override
	public Award current() {
		return awards.get(this.index);
	}
	
}
