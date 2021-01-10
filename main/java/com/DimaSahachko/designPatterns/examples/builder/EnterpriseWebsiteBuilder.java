package main.java.com.DimaSahachko.designPatterns.examples.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {

	@Override
	void buildName() {
		website.setName("Entedprise website");
	}

	@Override
	void builsCms() {
		website.setCms(Cms.ALIFRESCO);
	}

	@Override
	void buildPrice() {
		website.setPrice(10000);
	}

}
