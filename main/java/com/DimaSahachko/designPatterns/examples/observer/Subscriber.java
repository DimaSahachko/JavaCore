package main.java.com.DimaSahachko.designPatterns.examples.observer;

import java.util.List;

public class Subscriber implements Observer {
	String  name;

	public Subscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void handleEvent(List<String> vacancies) {
		System.out.println("Dear " + name + "\nWe have some changes in vacancies:\n" + vacancies + 
				"\n===============================\n");
	}
	
}
