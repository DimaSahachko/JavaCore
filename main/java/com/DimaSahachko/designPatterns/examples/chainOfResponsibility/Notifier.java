package main.java.com.DimaSahachko.designPatterns.examples.chainOfResponsibility;

public abstract class Notifier {
	private int priority;
	private Notifier nextNotifier;
	
	public Notifier(int priority) {
		super();
		this.priority = priority;
	}
	
	public void setNextNotifier(Notifier nextNotifier) {
		this.nextNotifier = nextNotifier;
	}
	
	public void notifyManager(String message, int level) {
		if(level >= priority) {
			write(message);
		}
		if(nextNotifier != null) {
			nextNotifier.notifyManager(message, level);
		}
	}
	abstract public void write(String message);
	
}
