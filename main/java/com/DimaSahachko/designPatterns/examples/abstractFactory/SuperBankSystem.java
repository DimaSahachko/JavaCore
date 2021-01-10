package main.java.com.DimaSahachko.designPatterns.examples.abstractFactory;

public class SuperBankSystem {

	public static void main(String[] args) {
		ProjectTeamFactory bankTeam = new BankingTeamFactory();
		Developer2 dev = bankTeam.getDeveloper2();
		Tester tester = bankTeam.getTester();
		ProjectManager pm = bankTeam.getProjectManager();
		System.out.println("Creating bank project");
		dev.writeCode();
		tester.testCode();
		pm.manageProject();
	}

}
interface Developer2 {
	void writeCode();
}
class JavaDeveloper2 implements Developer2 {
	public void writeCode() {
	System.out.println("Java developer writes java code");	
	}
}
class PhpDeveloper2 implements Developer2 {
	public void writeCode() {
		System.out.println("php developer writes code");
	}
}
interface Tester {
	void testCode();
}
class QATester implements Tester {
	public void testCode() {
		System.out.println("QA tester tests banking code");
	}
}
class ManualTester implements Tester {
	public void testCode() {
		System.out.println("Manual tester tests website...");
	}
}
interface ProjectManager {
	void manageProject();
}
class BankProjectManager implements ProjectManager {
	public void manageProject() {
		System.out.println("Bank project manager manages bank project");
	}
}
class WebsiteProjectManager implements ProjectManager {
	public void manageProject() {
		System.out.println("Website project maanger manages website project");
	}
}
interface ProjectTeamFactory {
	Developer2 getDeveloper2();
	Tester getTester();
	ProjectManager getProjectManager();
}
class BankingTeamFactory implements ProjectTeamFactory {
	public Developer2 getDeveloper2() {
		return new JavaDeveloper2();
	}
	public Tester getTester() {
		return new QATester();
	}
	public ProjectManager getProjectManager() {
		return new BankProjectManager();
	}
}
class WebsiteTeamFactory implements ProjectTeamFactory {
	@Override
	public Developer2 getDeveloper2() {
		return new PhpDeveloper2();
	}
	@Override
	public Tester getTester() {
		return new ManualTester();
	}
	@Override
	public ProjectManager getProjectManager() {
		return new WebsiteProjectManager();
	}
}