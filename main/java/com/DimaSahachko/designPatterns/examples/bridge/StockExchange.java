package main.java.com.DimaSahachko.designPatterns.examples.bridge;

public class StockExchange extends Program {
	protected StockExchange(Developer dev) {
		super(dev);
		developer = dev;
	}

	@Override
	public void developProgram() {
		System.out.println("Stock Exchange development in progress...");
		developer.writeCode();
	}
	
}
