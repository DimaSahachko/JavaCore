package main.java.com.DimaSahachko.javacore.chapter11;

class NewThread4 implements Runnable {
	String name;
	Thread t;
	NewThread4(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("New thread " + t);
		t.start();
	}
	public void run() {
		try {
			for(int n = 5; n > 0; n--) {
				System.out.println(name + ": " + n);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + "was interrupted");
		}
		System.out.println(name + " completed");
	}
}

public class DemoJoin {

	public static void main(String[] args) {
		NewThread4 ob1 = new NewThread4("One");
		NewThread4 ob2 = new NewThread4("Two");
		NewThread4 ob3 = new NewThread4("Three");
		System.out.println("Thread One is running " + ob1.t.isAlive());
		System.out.println("Thread Two is running " + ob2.t.isAlive());
		System.out.println("Thread Three is running " + ob3.t.isAlive());
		try {
			System.out.println("Waiting for threads completing");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread is interrupted");
		}
		System.out.println("Thread One is running " + ob1.t.isAlive());
		System.out.println("Thread Two is running " + ob2.t.isAlive());
		System.out.println("Thread Three is running " + ob3.t.isAlive());
		System.out.println("Main thread completed");
	}

}
