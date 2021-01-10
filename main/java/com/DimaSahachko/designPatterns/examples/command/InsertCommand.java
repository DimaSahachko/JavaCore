package main.java.com.DimaSahachko.designPatterns.examples.command;

public class InsertCommand implements Command {
	Database database;

	public InsertCommand(Database database) {
		super();
		this.database = database;
	}
	
	public void execute() {
		database.insert();
	}
}
