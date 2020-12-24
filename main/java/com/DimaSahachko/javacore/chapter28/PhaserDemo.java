package main.java.com.DimaSahachko.javacore.chapter28;
import java.util.concurrent.*;
public class PhaserDemo {

	public static void main(String[] args) {
		Phaser psr = new Phaser(1);
		int curPhase;
		System.out.println("Starting");

		new Thread(new MyThread3(psr, "A")).start();
		new Thread(new MyThread3(psr, "B")).start();
		new Thread(new MyThread3(psr, "C")).start();
		
		curPhase = psr.getPhase();
		psr.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " Complete");
		
		curPhase = psr.getPhase();
		psr.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " Complete");
		
		curPhase = psr.getPhase();
		psr.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " Complete");
		
		curPhase = psr.getPhase();
		System.out.println("Now phase " + curPhase);
		psr.arriveAndDeregister();
		
		if(psr.isTerminated()) {
			System.out.println("The phaser is terminated");
		}
		
	}

}
class MyThread3 implements Runnable {
	Phaser psr;
	String name;
	MyThread3(Phaser p, String n) {
		psr = p;
		name = n;
		psr.register();
	}
	
	public void run() {
		System.out.println("Thread " + name + " beginning phase " + psr.getPhase());
		psr.arriveAndAwaitAdvance();
		try {
			Thread.sleep(200);
		} catch(InterruptedException e) {
			System.out.println("exc");
		}
		
		System.out.println("Thread " + name + " beginning phase " + psr.getPhase());
		psr.arriveAndAwaitAdvance();
		try {
			Thread.sleep(200);
		} catch(InterruptedException e) {
			System.out.println("exc");
		}
		
		System.out.println("Thread " + name + " beginning phase " + psr.getPhase());
		psr.arriveAndDeregister();
				
	}
}