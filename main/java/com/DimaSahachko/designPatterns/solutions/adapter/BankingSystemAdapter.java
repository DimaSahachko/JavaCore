package main.java.com.DimaSahachko.designPatterns.solutions.adapter;
/* Task description is in the BankClient class */
public class BankingSystemAdapter implements LocalBankingSystem {
	InternationalBankingSystem iBank;
	BankingSystemAdapter() {
		iBank = new InternationalBankingSystem();
	}
	void setInternationalBankingSystem(InternationalBankingSystem ibs) {
		iBank = ibs;
	}
	@Override
	public void WireMoney(int AccountNumber) {
		iBank.InternationalMoneyTransfer(AccountNumber);
	}
	@Override
	public void payForPurchase() {
		iBank.payForTransborderPurchase();
	}
	@Override
	public void payForPhoneBills(String provider, int phoneNumber, int sum) {
		iBank.payForMobilePhoneBills(provider, phoneNumber, sum);
	}
	
}
