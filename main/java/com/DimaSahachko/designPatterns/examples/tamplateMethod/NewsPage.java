package main.java.com.DimaSahachko.designPatterns.examples.tamplateMethod;

public class NewsPage extends WebsiteTemplate {

	@Override
	public void showPageContent() {
		System.out.println("News");
	}
	
}
