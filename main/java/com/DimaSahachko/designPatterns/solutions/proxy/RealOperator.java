package main.java.com.DimaSahachko.designPatterns.solutions.proxy;
/* Task description is in the OperatorClient class*/
import java.util.*;
public class RealOperator implements Operator {
	private List<Integer> randomNumbers;
	RealOperator(int length) {
		System.out.println("Creating and instantiating");
		randomNumbers = new ArrayList<Integer>();
		for(int x = 0; x < length; x++) {
			randomNumbers.add((int) (Math.random() * (1000000 - 1)) + 1);
		}
	}
	@Override
	public long elementsSum() {
		long sum = 0;
		for(int i : randomNumbers) {
			sum += i;
		}
		return sum;
	}
	@Override
	public int maxElement() {
		int max = 0;
		for(int i : randomNumbers) {
			if(i > max) {
				max = i;
			}
		}
		return max;
	}
	
}
