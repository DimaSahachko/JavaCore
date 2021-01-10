package main.java.com.DimaSahachko.designPatterns.examples.decorator;

public class JavaTeamLead extends DeveloperDecorator {
	JavaTeamLead(Developer developer) {
		super(developer);
	}
	public String sendWeekReport() {
		return " Send week report to customer.";
	}

	@Override
	public String doWork() {
		return super.doWork() + sendWeekReport();
	}
	
}
