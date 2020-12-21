package main.java.com.DimaSahachko.javacore.chapter11;

class CallMe2 {
	void call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}

class Caller2 implements Runnable {
	String msg;
	Thread t;
	CallMe2 target;
	Caller2(CallMe2 targ, String msg) {
		target = targ;
		this.msg = msg;
		t = new Thread(this);
		t.start();
	}
	public void run() {
		synchronized(target) {
			target.call(msg);
		}
	}
}
public class Synch2 {

	public static void main(String[] args) {
		CallMe2 target = new CallMe2();
		Caller2 ob1 = new Caller2(target, "Welcome");
		Caller2 ob2 = new Caller2(target, "to synchronized");
		Caller2 ob3 = new Caller2(target, "world!");
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}

}
