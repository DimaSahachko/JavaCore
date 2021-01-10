package main.java.com.DimaSahachko.designPatterns.examples.interpreter;

public class TerminalExpression implements Expression {
	private String data;

	public TerminalExpression(String data) {
		super();
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		if(context.contains(data)) {
			return true;
		}
		return false;
	}
	
	
}
