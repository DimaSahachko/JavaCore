package main.java.com.DimaSahachko.designPatterns.solutions.memento;
/*Task description is in the GameRunner state*/
import java.util.*;
public class History {
	Deque<Hero.Save> history = new ArrayDeque<>();
	void accept(Hero.Save save) {
		history.add(save);
	}
	
	Hero.Save getSaving() {
		return history.getLast();
	}
}
