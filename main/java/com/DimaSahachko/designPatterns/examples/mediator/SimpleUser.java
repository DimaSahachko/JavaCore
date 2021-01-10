package main.java.com.DimaSahachko.designPatterns.examples.mediator;

public class SimpleUser implements User {
	String name;
	Chat chat;
	public SimpleUser(String name, Chat chat) {
		super();
		this.name = name;
		this.chat = chat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void sendMassage(String message) {
		chat.sendMessage(message, this);
	}
	@Override
	public void receiveMessage(String message) {
		System.out.println(name + " receiving a message " + message + ".");
	}
	
}
