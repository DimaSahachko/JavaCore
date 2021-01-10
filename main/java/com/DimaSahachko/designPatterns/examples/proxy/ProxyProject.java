package main.java.com.DimaSahachko.designPatterns.examples.proxy;

public class ProxyProject implements Project {
	private RealProject rp = null;
	private String url;
	ProxyProject(String url) {
		this.url = url;
	}
	@Override
	public void run() {
		if(rp == null) {
			rp = new RealProject(url);
		}
		rp.run();
	}
	 
}	
