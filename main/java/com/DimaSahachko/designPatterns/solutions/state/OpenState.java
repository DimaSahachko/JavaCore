package main.java.com.DimaSahachko.designPatterns.solutions.state;
/*Task description is in the Owner class*/
public class OpenState implements State {
	Lock lock;
	
	public OpenState(Lock lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void open() {
		System.out.println("Lock is already open. Come on!");
	}

	@Override
	public void close() {
		System.out.println("Lock is closed.");
		lock.changeState(new CloseState(lock));
	}
	
}
