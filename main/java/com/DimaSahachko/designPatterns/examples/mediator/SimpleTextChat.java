package main.java.com.DimaSahachko.designPatterns.examples.mediator;
import java.util.*;
public class SimpleTextChat implements Chat {
	User admin;
	List<User> users = new ArrayList<>();
	
	public void setAdmin(User admin) {
		this.admin = admin;
	}
	
	void addUsersToChat(User user) {
		users.add(user);
	}

	@Override
	public void sendMessage(String message, User sender) {
		for(User u : users) {
			if(u != sender) {
				u.receiveMessage(message);
			}
		}
		admin.receiveMessage(message);
	}
	
	
}
