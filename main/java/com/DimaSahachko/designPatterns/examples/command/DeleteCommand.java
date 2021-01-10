package main.java.com.DimaSahachko.designPatterns.examples.command;

public class DeleteCommand implements Command {
	Database database;

	public DeleteCommand(Database database) {
		super();
		this.database = database;
	}
	
	public void execute() {
		database.delete();
	}
}
