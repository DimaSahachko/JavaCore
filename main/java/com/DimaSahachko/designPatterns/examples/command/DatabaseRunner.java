package main.java.com.DimaSahachko.designPatterns.examples.command;

public class DatabaseRunner {

	public static void main(String[] args) {
		Database db = new Database();
		Command insert = new InsertCommand(db);
		Command update = new UpdateCommand(db);
		Command select = new SelectCommand(db);
		Command delete = new DeleteCommand(db);
		
		Developer developer = new Developer(insert, update, select, delete);
		
		developer.insertRecord();
		developer.updateRecord();
		developer.selectRecord();
		developer.deleteRecord();
	}

}
