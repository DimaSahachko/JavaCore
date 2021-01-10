package main.java.com.DimaSahachko.designPatterns.examples.mediator;

public class SimpleChatRunner {

	public static void main(String[] args) {
		SimpleTextChat chat = new SimpleTextChat();
		User admin = new Admin(chat, "Admin");
		User user1 = new SimpleUser("User 1", chat);
		User user2 = new SimpleUser("User 2", chat);
		
		chat.setAdmin(admin);
		chat.addUsersToChat(user1);
		chat.addUsersToChat(user2);
		
		user1.sendMassage("Hello. I'm user 1");
		admin.sendMassage("Roger that. I am admin");
	}
}
