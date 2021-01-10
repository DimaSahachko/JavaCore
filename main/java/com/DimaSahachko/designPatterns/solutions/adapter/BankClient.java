package main.java.com.DimaSahachko.designPatterns.solutions.adapter;
/* Lets assume that we have a bank that used to support only internal operations. But our bank has become more popular.
 * And we is expected to provide international functionality like international money transferring or paying for mobile phone
 * bills of foreign provider. But we want our clients not to see any inconveniences and don't have to get used to new interface
 * of our applications.
 * So we've created software which is able to support international operations. But our users can use old good software to perform
 * brand new operations. And this new functionality won't take getting used to. */
public class BankClient {

	public static void main(String[] args) {
		LocalBankingSystem bank = new BankingSystemAdapter();
		bank.WireMoney(13131113);
		bank.payForPurchase();
		bank.payForPhoneBills("Utell", 898556566, 200);
	}

}
