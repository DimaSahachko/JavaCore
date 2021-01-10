package main.java.com.DimaSahachko.designPatterns.solutions.state;
/*Task description is in the Owner class*/
public class Lock {
	State state;
	Lock() {
		state = new CloseState(this);
	}
	public void changeState(State state) {
		this.state = state;
	}
	public void open() {
		state.open();
	}
	public void close() {
		state.close();
	}
}
