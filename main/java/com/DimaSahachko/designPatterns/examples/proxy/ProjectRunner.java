package main.java.com.DimaSahachko.designPatterns.examples.proxy;

public class ProjectRunner {

	public static void main(String[] args) {
		Project project = new ProxyProject("https://www.github.com/proselytear/realProject");
		project.run();
	}

}
