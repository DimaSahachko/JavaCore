package main.java.com.DimaSahachko.javacore.chapter11;

class CallMe {
	synchronized void call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}

class Caller implements Runnable {
	String msg;
	Thread t;
	CallMe target;
	Caller(CallMe targ, String msg) {
		target = targ;
		this.msg = msg;
		t = new Thread(this);
		t.start();
	}
	public void run() {
		target.call(msg);
	}
}
public class Synch {

	public static void main(String[] args) {
		CallMe target = new CallMe();
		Caller ob1 = new Caller(target, "Welcome");
		Caller ob2 = new Caller(target, "to synchronized");
		Caller ob3 = new Caller(target, "world!");
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}

}
