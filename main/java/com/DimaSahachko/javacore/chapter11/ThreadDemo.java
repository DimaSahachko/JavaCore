package main.java.com.DimaSahachko.javacore.chapter11;

class NewThread implements Runnable {
	Thread t;
	NewThread() {
		t = new Thread(this, "Demo Thread");
		System.out.println("Second thread has been created");
		t.start();
	}
	public void run() {
		try {
			for(int n = 5; n > 0; n--) {
				System.out.println(n);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Second thread was interrupted");
		}
		System.out.println("Second thread is completed");
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		new NewThread();
		try {
			for(int n = 5; n > 0; n--) {
				System.out.println(n);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread was interrupted");
		}
		System.out.println("Main thread is completed");
	}

}
