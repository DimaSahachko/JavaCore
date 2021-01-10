package main.java.com.DimaSahachko.designPatterns.solutions.bridge;
/*Task description is in the User class*/
public class ManagerInterface extends UserInterface {
	ManagerInterface(Product product) {
		this.product = product;
	}

	@Override
	void showInformation() {
		product.showTitle();
		product.showModel();
		product.showStatistic();
		product.showSupplierInformaiton();
	}
	
}

