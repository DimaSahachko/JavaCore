package main.java.com.DimaSahachko.javacore.chapter11;

class NewThread2 extends Thread {
	NewThread2() {
		super("Demo thread");
		System.out.println("Second thread is " + this);
		start();
	}
	public void run() {
		try {
			for(int n = 5; n > 0; n--) {
				System.out.println("Second thread: " + n);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Second thread was interrupted");
		}
		System.out.println("Second thread is completed");
	}
}

public class ExtendThread {

	public static void main(String[] args) {
		new NewThread2();
		try {
			for(int n = 5; n > 0; n--) {
				System.out.println("Main thread: " + n);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread was interrupted");
		}
		System.out.println("Main thread is completed");
		
	}

}
