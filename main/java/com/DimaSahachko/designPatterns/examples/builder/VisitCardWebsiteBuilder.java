package main.java.com.DimaSahachko.designPatterns.examples.builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {

	@Override
	void buildName() {
		website.setName("Visit card");
	}

	@Override
	void builsCms() {
		website.setCms(Cms.WORDPRESS);
	}

	@Override
	void buildPrice() {
		website.setPrice(500);
	}

	


	


}
