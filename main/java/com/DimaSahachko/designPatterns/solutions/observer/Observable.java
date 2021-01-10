package main.java.com.DimaSahachko.designPatterns.solutions.observer;
/*Task description is in the FinancialSystem class*/
public interface Observable {
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers();
}
