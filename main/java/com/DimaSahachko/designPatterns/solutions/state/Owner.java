package main.java.com.DimaSahachko.designPatterns.solutions.state;
/*We have a lock. It has only two state: open and close. Initially it is in the close state.
 *If we try to close it when it is in the close state the lock's state won't change(the same for an open state).*/
public class Owner {

	public static void main(String[] args) {
		Lock lock = new Lock();

		lock.close(); //trying to close an already closed lock;
		lock.close();
		
		lock.open(); //finally we've opened it;
		
		lock.close();
		
		lock.open();
		lock.open(); //trying to open an already opened lock;
		lock.open();
	}

}
