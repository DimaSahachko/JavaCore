package main.java.com.DimaSahachko.designPatterns.examples.memento;
import java.util.*;
public class Save {
	private final String version;
	private final Date date;
	Save(String version) {
		this.version = version;
		date = new Date();
	}
	public String getVersion() {
		return version;
	}
	public Date getDate() {
		return date;
	}
	
}
