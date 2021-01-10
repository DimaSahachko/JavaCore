package main.java.com.DimaSahachko.designPatterns.solutions.templateMethod;
/*Task description is in the Client class*/
public class CheapLawyerFirm  extends LawyerFirm {

	@Override
	public void sueStatementOfClaim() {
		System.out.println("Suing typical statement of claim");
	}

	@Override
	public void representInCourt() {
		System.out.println("Providing low quality representation in the court");
	}
	
}
