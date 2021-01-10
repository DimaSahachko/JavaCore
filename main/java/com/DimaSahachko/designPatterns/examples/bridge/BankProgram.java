package main.java.com.DimaSahachko.designPatterns.examples.bridge;

public class BankProgram extends Program {
	protected BankProgram(Developer dev) {
		super(dev);
		developer = dev;
	}

	@Override
	public void developProgram() {
		System.out.println("Bank Sytem development in progress...");
		developer.writeCode();
	}	
}
