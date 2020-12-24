package main.java.com.DimaSahachko.javacore.chapter28;
import java.util.concurrent.locks.*;
public class LockDemo {

	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		new Thread(new LockThread(lock, "A")).start();
		new Thread(new LockThread(lock, "B")).start();
	}

}
class Shared2 {
	static int count = 0;
}

class LockThread implements Runnable {
	Lock lock;
	String name;
	LockThread(Lock l, String n) {
		lock = l;
		name = n;
	}
	public void run() {
		System.out.println("Starting " + name);
		try{
			System.out.println(name + " is waiting for lock count");
			lock.lock();
			System.out.println(name + " is locking count");
			Shared2.count++;
			System.out.println(name+ ": " + Shared2.count);
			System.out.println(name + " is sleeping");
			Thread.sleep(1000);
		} catch (InterruptedException e ) {
			System.out.println("exc");
		} finally {
			System.out.println(name + " is unlocking count");
			lock.unlock();
		}
		
	}
}