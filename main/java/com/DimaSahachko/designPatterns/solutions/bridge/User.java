package main.java.com.DimaSahachko.designPatterns.solutions.bridge;
/*We have an online shop application. This application has different UI for customers and for managers.
 * On the other hand we have a Product interface and few different implementations of this interface - concrete products
 * with a name, model, price etc.
 * And dependently on used interface these products give us different information about themselves:
 * for customers - information that may be interesting for them
 * and for managers - specific information that is needed only for managers.
 *  */ 
public class User {

	public static void main(String[] args) {
		UserInterface customer = new CustomerInterface(new PowerSaw());
		customer.showInformation();
		System.out.println("=============");
		UserInterface manager = new ManagerInterface(new PowerSaw());
		manager.showInformation();
	}

}
