package main.java.com.DimaSahachko.javacore.chapter11;

class Q {
	int n;
	synchronized int get() {
		System.out.println("Get " + n);
		return n;
	}
	synchronized void set(int n) {
		this.n = n;
		System.out.println("Was sent " + n);
	}
}

class Producer implements Runnable {
	Q q;
	Producer(Q q) {
		this.q = q;
		new Thread(this, "thread to produce").start();
	}
	public void run() {
		int i = 0;
		while(true) {
			q.set(i++);
		}
	}
	
}

class Consumer implements Runnable {
	Q q;
	Consumer(Q q) {
		this.q = q;
		new Thread(this, "thread to consume").start();
	}
	public void run() {
		while(true) {
			q.get();
		}
	}
}

public class PC {

	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("Press Ctrl+c to terminate");
	}

}