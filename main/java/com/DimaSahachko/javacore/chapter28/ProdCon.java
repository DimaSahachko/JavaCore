package main.java.com.DimaSahachko.javacore.chapter28;
import java.util.concurrent.*;

class Q {
	int n;
	static Semaphore semCon = new Semaphore(0);
	static Semaphore semProd = new Semaphore(1);
	
	void get() {
		try {
			semCon.acquire();
		} catch (InterruptedException e) {
			System.out.println("Exc is caught");
		}
		System.out.println("Got " + n);
		semProd.release();
	}
	
	void set(int i) {
		try {
			semProd.acquire();
		} catch (InterruptedException e) {
			System.out.println("Exc is caught");
		}
		n = i;
		System.out.println("Put " + n);
		semCon.release();
	}
}
class Producer implements Runnable {
	Q q;
	Producer(Q q) {
		this.q = q;
	}
	public void run() {
		for(int x = 0; x < 20; x++) {
			q.set(x);
		}
	}
	
}
class Consumer implements Runnable {
	Q q;
	Consumer(Q q) {
		this.q = q;
	}
	public void run() {
		for(int x = 0; x < 20; x++) {
			q.get();
		}
	}
}
public class ProdCon {

	public static void main(String[] args) {
		Q q = new Q();
		new Thread(new Producer(q)).start();
		new Thread(new Consumer(q)).start();
	}

}
