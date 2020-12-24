package main.java.com.DimaSahachko.javacore.chapter28;

import java.util.concurrent.*;

public class SemDemo {

	public static void main(String[] args) {
		Semaphore sem = new Semaphore(1);
		new Thread(new IncThread(sem, "A")).start();
		new Thread(new DecThread(sem, "B")).start();
	}

}
class Shared {
	static int count = 0;
}
class IncThread implements Runnable {
	Semaphore sem;
	String name;
	
	IncThread(Semaphore s, String name) {
		sem = s;
		this.name = name;
	}
	public void run() {
		System.out.println("Starting " + name);
		try {
			System.out.println(name + " is waiting for a permit");
			sem.acquire();
			System.out.println(name + " get a permit");
			for(int i = 0; i < 5; i++) {
				Shared.count++;
				System.out.println(name + ": " + Shared.count);
				Thread.sleep(10);
			}
		} catch (InterruptedException e) {
			System.out.println("exc");
		}
		System.out.println(name + " releases the permit");
		sem.release();		
	}
}

class DecThread implements Runnable {
	Semaphore sem;
	String name;
	
	DecThread(Semaphore s, String name) {
		sem = s;
		this.name = name;
	}
	public void run() {
		System.out.println("Starting " + name);
		try {
			System.out.println(name + " is waiting for a permit");
			sem.acquire();
			System.out.println(name + " get a permit");
			for(int i = 0; i < 5; i++) {
				Shared.count--;
				System.out.println(name + ": " + Shared.count);
				Thread.sleep(10);
			}
		} catch (InterruptedException e) {
			System.out.println("exc");
		}
		System.out.println(name + " releases the permit");
		sem.release();		
	}
}

