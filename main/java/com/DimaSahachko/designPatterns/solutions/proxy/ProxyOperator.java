package main.java.com.DimaSahachko.designPatterns.solutions.proxy;
/* Task description is in the OperatorClient class*/
public class ProxyOperator implements Operator {
	private RealOperator real = null;
	private int length;
	ProxyOperator(int length) {
		this.length = length;
	}
	@Override
	public long elementsSum() {
		if(real == null) {
			real = new RealOperator(length);
		}
		return real.elementsSum();
	}
	@Override
	public int maxElement() {
		if(real == null) {
			real = new RealOperator(length);
		}
		return real.maxElement();
	}
	
}
