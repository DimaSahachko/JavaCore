package main.java.com.DimaSahachko.designPatterns.solutions.adapter;
/* Task description is in the BankClient class */
public class InternationalBankingSystem {
	void InternationalMoneyTransfer(int AccountNumber) {
		System.out.println("International money transfer is performing. Receiver - " + AccountNumber);
	}
	void payForTransborderPurchase() {
		System.out.println("Payment for your transborder purchase is fulfilling");
	}
	void payForMobilePhoneBills(String provider, int phoneNumber, int sum) {
		System.out.println("Provider: " + provider + ", phone number: " + phoneNumber + " sum: " + sum);
	}
}
