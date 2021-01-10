package main.java.com.DimaSahachko.designPatterns.examples.builder;

public class Director {
	WebsiteBuilder builder;

	public void setBuilder(WebsiteBuilder builder) {
		this.builder = builder;
	}
	
	Website buildWebsite() {
		builder.createWebsite();
		builder.buildName();
		builder.builsCms();
		builder.buildPrice();
		return builder.getWebsite();
	}
}
