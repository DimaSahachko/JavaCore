package main.java.com.DimaSahachko.javacore.chapter28;
import java.util.concurrent.*;
public class PhaserDemo2 {

	public static void main(String[] args) {
		MyPhaser mp = new MyPhaser(4, 1);
		System.out.println("Starting");
		new Thread(new MyThread4(mp, "A")).start();
		new Thread(new MyThread4(mp, "B")).start();
		new Thread(new MyThread4(mp, "C")).start();
		while(!mp.isTerminated()) {
			mp.arriveAndAwaitAdvance();
		}
		System.out.println("Operation is terminated");
		
		
	}

}
class MyThread4 implements Runnable {
	Phaser mp;
	String name;
	MyThread4(Phaser phaser, String n) {
		mp = phaser;
		name = n;
		mp.register();
	}
	public void run() {
		while(!mp.isTerminated()) {
			System.out.println("Thread " + name + " " + Thread.currentThread().getName() +  " beginning phase " + mp.getPhase());
			mp.arriveAndAwaitAdvance();
			try {
				Thread.sleep(100);
			} catch(InterruptedException e) {
				System.out.println("exc");
			}
		}
	}
}
class MyPhaser extends Phaser {
	int parties;
	int terminator;
	MyPhaser(int numOfOper, int parties) {
		super(parties);
		this.parties = parties;
		terminator = numOfOper - 1;
	}
	protected boolean onAdvance(int p, int party) {
		System.out.println("Phase " + p + " completed. Thread - " + Thread.currentThread().getName());
		if(p == terminator || party == 0) {
			return true;
		}
		return false;
	}
}
