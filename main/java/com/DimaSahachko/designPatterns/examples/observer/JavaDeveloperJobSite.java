package main.java.com.DimaSahachko.designPatterns.examples.observer;
import java.util.*;
public class JavaDeveloperJobSite implements Observed {
	List<String> vacancies = new ArrayList<String>();
	List<Observer> subscribers = new ArrayList<>();
	@Override
	public void addObserver(Observer observer) {
		subscribers.add(observer);
	}
	@Override
	public void removeObserver(Observer observer) {
		subscribers.remove(observer);
	}
	@Override
	public void notifyObservers() {
		for(Observer observer : subscribers) {
			observer.handleEvent(vacancies);
		}
	}
	public void addVacancy(String vacancy) {
		vacancies.add(vacancy);
		notifyObservers();
	}
	public void removeVacancy(String vacancy) {
		vacancies.remove(vacancy);
		notifyObservers();
	}
}
