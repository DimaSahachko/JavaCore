package main.java.com.DimaSahachko.designPatterns.solutions.adapter;
/* Task description is in the BankClient class */
public interface LocalBankingSystem {
	void WireMoney(int AccountNumber);
	void payForPurchase();
	void payForPhoneBills(String provider, int phoneNumber, int sum);
}
