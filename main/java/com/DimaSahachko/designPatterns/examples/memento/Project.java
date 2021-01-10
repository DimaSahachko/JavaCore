package main.java.com.DimaSahachko.designPatterns.examples.memento;
import java.util.*;
public class Project {
	private String version;
	private Date date;
	
	public void setVersionAndDate(String version) {
		this.version = version;
		date = new Date();
	}
	
	public Save save() {
		return new Save(version);
	}
	public void load(Save save) {
		version = save.getVersion();
		date = save.getDate();
	}
	@Override
	public String toString() {
		return "Project:\n" +
				"\nVersion: " + version + 
				"\nDate: " + date + "\n";
	}
	
	
}
