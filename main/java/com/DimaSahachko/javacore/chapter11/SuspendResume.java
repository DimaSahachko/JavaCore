package main.java.com.DimaSahachko.javacore.chapter11;

class NewThread5 implements Runnable {
	String name;
	Thread t;
	boolean suspendFlag;
	NewThread5(String name) {
		this.name = name;
		t = new Thread(this, name);
		System.out.println("New thread " + t);
		suspendFlag = false;
	}
	public void run() {
		try {
			for(int x = 15; x > 0; x--) {
				System.out.println(name + ":" + x);
				Thread.sleep(200);
				synchronized (this) {
					while(suspendFlag) {
						wait();
					}
				}
			}
		} catch (InterruptedException e) {
			System.out.println(name + " interrupted");
		}
		System.out.println(name + " exiting");
	}
	synchronized void mySuspend() {
		suspendFlag = true;
	}
	synchronized void myResume() {
		suspendFlag = false;
		notify();
	}
}

public class SuspendResume {

	public static void main(String[] args) {
		NewThread5 ob1 = new NewThread5("one");
		NewThread5 ob2 = new NewThread5("two");
		ob1.t.start();
		ob2.t.start();
		
		try {
			Thread.sleep(1000);
			ob1.mySuspend();
			System.out.println("Suspending thread one");
			Thread.sleep(1000);
			ob1.myResume();
			System.out.println("Resuming thread one");
			ob2.mySuspend();
			System.out.println("Suspending thread two");
			Thread.sleep(1000);
			ob2.myResume();
			System.out.println("Resume thread two");
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		try {
			ob1.t.join();
			ob2.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread exiting");
	}

}
