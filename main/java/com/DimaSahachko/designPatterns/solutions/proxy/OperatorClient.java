package main.java.com.DimaSahachko.designPatterns.solutions.proxy;
/*We have an application that create a list of random integers and you can define the length of this list via a constructor
 * at the moment of the creation an instance.
 * The main logic is in the RealOperator class. But this class make an instantiation of the list of random integers at once
 * at the moment of creation an instance of the class (in the constructor).
 * And we know that depends on the length of this list it may be really resource-consuming operation.
 * So it make sense to use a proxy in order to put off the instantiation of our random-integers list until the moment when we call
 * some methods which need this list to be instantiated*/
public class OperatorClient {

	public static void main(String[] args) {
		Operator operator = new ProxyOperator(10000000);
		System.out.println(operator.elementsSum());
	}

}
