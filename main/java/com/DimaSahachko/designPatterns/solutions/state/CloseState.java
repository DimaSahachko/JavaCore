package main.java.com.DimaSahachko.designPatterns.solutions.state;
/*Task description is in the Owner class*/
public class CloseState implements State {
	Lock lock;
	
	public CloseState(Lock lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void open() {
		System.out.println("Lock is open.");
		lock.changeState(new OpenState(lock));
	}

	@Override
	public void close() {
		System.out.println("Lock is already closed. Come on!");
	}
	
}
