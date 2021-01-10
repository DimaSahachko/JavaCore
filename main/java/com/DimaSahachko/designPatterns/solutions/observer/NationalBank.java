package main.java.com.DimaSahachko.designPatterns.solutions.observer;
/*Task description is in the FinancialSystem class*/
import java.util.*;
public class NationalBank implements Observable{
	private List<Observer> commerceBanks = new ArrayList<>();
	private Map<String, Double> currencyRates = new HashMap<>();
	NationalBank() {
		currencyRates.put("USD", 28.40);
		currencyRates.put("EUR", 34.1);
		currencyRates.put("RUB", 0.31);
	}
	
	void updateCurrencyRates(double usd, double eur, double rub) {
		Set<String> keys = currencyRates.keySet();
		for(String key : keys) {
			if(key == "USD") {
				currencyRates.replace("USD", usd);
			}
			if(key == "EUR") {
				currencyRates.replace("EUR", eur);
			}
			if(key == "RUB") {
				currencyRates.replace("RUB", rub);
			}
		}
		notifyObservers();
	}
	
	public Map<String, Double> getCurrencyRates() {
		return currencyRates;
	}

	@Override
	public void addObserver(Observer observer) {
		commerceBanks.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		commerceBanks.add(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer bank : commerceBanks) {
			bank.update();
		}
	}
	
}
