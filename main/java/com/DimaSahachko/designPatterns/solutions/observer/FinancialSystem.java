package main.java.com.DimaSahachko.designPatterns.solutions.observer;
/*We have a NationalBank which periodically update the official currency rates. In our example this is observable thing.
 * Different commercials bank(which are observers) keep track on national bank and when 
 * it updates currency rates it notifies observing commercial banks.*/
public class FinancialSystem {
	public static void main(String[] args) {
	NationalBank nacBank = new NationalBank();
	Observer privatBank = new CommerceBank("Privat Bank", nacBank);
	Observer raifaizen = new CommerceBank("Raifaizen Bank", nacBank);
	nacBank.addObserver(privatBank);
	nacBank.addObserver(raifaizen);
	nacBank.updateCurrencyRates(28.30, 33.90, 0.31);
	nacBank.updateCurrencyRates(29, 34, 31);
	}
}
