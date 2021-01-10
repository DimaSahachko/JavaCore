package main.java.com.DimaSahachko.designPatterns.solutions.templateMethod;
/*Task description is in the Client class*/
public class HighProfileLawyerFirm extends LawyerFirm {

	@Override
	public void sueStatementOfClaim() {
		System.out.println("Suing well-grounded statement of claim");
	}

	@Override
	public void sueLegalCostsPetition() {
		System.out.println("Suing legal costs petition");
	}

	@Override
	public void representInCourt() {
		System.out.println("Providing high quality representation in the court");
	}
	
}
