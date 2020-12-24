package main.java.com.DimaSahachko.javacore.chapter28;
import java.util.concurrent.*;
public class BarDemo {

	public static void main(String[] args) {
		CyclicBarrier cbar = new CyclicBarrier(3, new BarAction());
		new Thread(new MyThread2(cbar, "A")).start();
		new Thread(new MyThread2(cbar, "B")).start();
		new Thread(new MyThread2(cbar, "C")).start();

	}

}
class MyThread2 implements Runnable {
	CyclicBarrier cb;
	String name;
	MyThread2(CyclicBarrier cb, String name) {
		this.cb = cb;
		this.name = name;
	}
	public void run() {
		System.out.println(name + " " + Thread.currentThread().getName());
		try {
			cb.await();
		} catch(InterruptedException | BrokenBarrierException e) {
			
		}
		System.out.println(name + " has completed execution");
	}
}

class BarAction implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Barrier reached!");
	}
}
