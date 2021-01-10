package main.java.com.DimaSahachko.designPatterns.solutions.bridge;
/*Task description is in the User class*/
public class CustomerInterface extends UserInterface {
	CustomerInterface(Product product) {
		this.product = product;
	}
	@Override
	void showInformation() {
		product.showTitle();
		product.showDescription();
		product.showModel();
		product.showInstruction();
		product.showPrice();
		product.showSimilar();
	}
	
}
