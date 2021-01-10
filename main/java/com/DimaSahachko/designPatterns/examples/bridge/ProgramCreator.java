package main.java.com.DimaSahachko.designPatterns.examples.bridge;

public class ProgramCreator {

	public static void main(String[] args) {
		Program[] programs = {new BankProgram(new JavaDeveloper()),
				new StockExchange(new CppDeveloper())};
		for(Program program : programs) {
			program.developProgram();
		}
	}

}
