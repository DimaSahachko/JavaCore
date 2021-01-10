package main.java.com.DimaSahachko.designPatterns.solutions.bridge;
/*Task description is in the User class*/
public class PowerSaw implements Product {

	@Override
	public void showTitle() {
		System.out.println("PowerSaw \"Stern\" " );
	}

	@Override
	public void showDescription() {
		System.out.println("One handed power saw. Required voltage 220V. The length of wire - 2m. ... ");
	}

	@Override
	public void showModel() {
		System.out.println("T3131");
	}

	@Override
	public void showInstruction() {
		System.out.println("Instruction is being shown here");
	}

	@Override
	public void showStatistic() {
		System.out.println("This product has been viewed 42 times this month. 12 times was added to bucket. Was liked 23 times");
	}

	@Override
	public void showPrice() {
		System.out.println("price - 800");
	}

	@Override
	public void showSimilar() {
		System.out.println("http:\\\\eqeq.com\\213");
		System.out.println("http:\\\\eqeq.com\\32124");
	}

	@Override
	public void showSupplierInformaiton() {
		System.out.println("Firm \"Stern\" Ukraine. Adress: Dnipro, Haharina street, house 45. Phone: +380983224343");
	}

	

}
