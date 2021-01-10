package main.java.com.DimaSahachko.designPatterns.examples.builder;

public abstract class WebsiteBuilder {
	Website website;
	void createWebsite() {
		website = new Website();
	}
	abstract void buildName();
	abstract void builsCms();
	abstract void buildPrice();
	
	Website getWebsite() {
		return website;
	}
}
