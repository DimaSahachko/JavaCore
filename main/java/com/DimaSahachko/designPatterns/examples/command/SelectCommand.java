package main.java.com.DimaSahachko.designPatterns.examples.command;

public class SelectCommand implements Command {
	Database database;

	public SelectCommand(Database database) {
		super();
		this.database = database;
	}
	
	public void execute() {
		database.select();
	}
}
