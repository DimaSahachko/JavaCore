package main.java.com.DimaSahachko.javacore.chapter11;

class Q2 {
	int n;
	boolean valueSet = false;
	synchronized int get() {
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Get " + n);
		valueSet = false;
		notify();
		return n;
	}
	synchronized void set(int n) {
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.n = n;
		valueSet = true;
		System.out.println("Was sent " + n);
		notify();
	}
}

class Producer2 implements Runnable {
	Q2 q;
	Producer2(Q2 q) {
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

class Consumer2 implements Runnable {
	Q2 q;
	Consumer2(Q2 q) {
		this.q = q;
		new Thread(this, "thread to consume").start();
	}
	public void run() {
		while(true) {
			q.get();
		}
	}
}

public class PC2 {

	public static void main(String[] args) {
		Q2 q = new Q2();
		new Producer2(q);
		new Consumer2(q);
		System.out.println("Press Ctrl+c to terminate");
	}

}
