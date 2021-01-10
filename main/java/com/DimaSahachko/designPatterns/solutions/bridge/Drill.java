package main.java.com.DimaSahachko.designPatterns.solutions.bridge;
/*Task description is in the User class*/
public class Drill implements Product {

	@Override
	public void showTitle() {
		System.out.println("Drill \"Yokohama\"");
	}

	@Override
	public void showDescription() {
		System.out.println("Universal hand drill for home using. Required voltage 200V. The rotate speed - 500 rotation per second...");
	}

	@Override
	public void showModel() {
		System.out.println("D422");
	}

	@Override
	public void showInstruction() {
		System.out.println("Instruction is being shown here");
	}

	@Override
	public void showStatistic() {
		System.out.println("This product has been viewed 543 times this month. 111 times was added to bucket. Was liked 89 times");
	}

	@Override
	public void showPrice() {
		System.out.println("price - 343");
	}

	@Override
	public void showSimilar() {
		System.out.println("http:\\\\eqeq.com\\3242");
		System.out.println("http:\\\\eqeq.com\\098");
	}

	@Override
	public void showSupplierInformaiton() {
		System.out.println("Firm \"Yokohama\" China. Adress of officail importer: Kyiv, Kalynove street, house 45. Phone: +380984234786");
	}
	
}
