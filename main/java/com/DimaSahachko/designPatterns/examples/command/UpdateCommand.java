package main.java.com.DimaSahachko.designPatterns.examples.command;

public class UpdateCommand implements Command {
	Database database;

	public UpdateCommand(Database database) {
		super();
		this.database = database;
	}
	
	public void execute() {
		database.update();
	}
}
