package main.java.com.DimaSahachko.designPatterns.solutions.observer;
/*Task description is in the FinancialSystem class*/
public class CommerceBank implements Observer {
	String name;
	NationalBank nationalBank;
	String officialUSDollarRate;
	String officialEuroRate;
	String officialRubleRate;
	public CommerceBank(String name, NationalBank nationalBank) {
		super();
		this.nationalBank = nationalBank;
		this.name = name;
	}
	@Override
	public void update() {
		System.out.println("To clients attention. " + name + " glad to inform that current official currency rates are: ");
		nationalBank.getCurrencyRates().forEach((a, b) -> System.out.print(a + ": " + b +"  "));
		System.out.println("\n");
	}
	
}
