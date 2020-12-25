package main.java.com.DimaSahachko.javacore.modul1_4;
import java.util.concurrent.locks.*;
import java.util.concurrent.atomic.*;
import java.util.concurrent.*;
public class FizzBuzzStarter {

	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz(15);
		CompletableFuture.runAsync(() -> fb.fizz());
		CompletableFuture.runAsync(() -> fb.buzz());
		CompletableFuture.runAsync(() -> fb.fizzBuzz());
		CompletableFuture.runAsync(() -> fb.number());
	}

}
class FizzBuzz {
	Lock lock = new ReentrantLock();
	Condition cond = lock.newCondition();
	int n;
	AtomicInteger count = new AtomicInteger(1);
	
	FizzBuzz(int n) {
		this.n = n;
	}
	public  void fizz() {
		while(count.get() <= n) { //we specify how long we are going to perform this method
			lock.lock();  //try to acquire lock;
		try {
			while( (((count.get() % 5) == 0) && ((count.get() % 3) == 0)) ||  (count.get() % 3) != 0 ) { //if the current value of the 'count' doesn't satisfy us
				if(count.get() == n) { //check if it is the last iteration of this method and if it is --->
					return; //return this method in order not to wait forever
				}
				cond.await(); //if it is not the last iteration of the method we are going to be waiting for signal()
			}
			if(count.get() == n) { //our useful work
				System.out.print("fizz.");
				return; //if it the last iteration return the method
			} else {
				System.out.print("fizz, ");
				count.getAndIncrement();
			}
		} catch(InterruptedException e) {
				System.out.println("exc");
		} finally {
			cond.signalAll(); //after performing the method and incrementing the 'count', we are signaling to others to awake them
			lock.unlock();
		}
		}
	}
	public  void buzz() {
		while(count.get() <= n) {
		lock.lock();
		try {
			while( (((count.get() % 5) == 0) && ((count.get() % 3) == 0)) ||  (count.get() % 5) != 0 ) {
				if(count.get() == n) {
					return;
				}
				cond.await();
			}
			if(count.get() == n) {
				System.out.print("buzz.");
				return;
			} else {
				System.out.print("buzz, ");
				count.getAndIncrement();
			}
		} catch(InterruptedException e) {
				System.out.println("exc");
		} finally {
			cond.signalAll();
			lock.unlock();
		}
		}
	}
	
	public  void fizzBuzz() {
		while(count.get() <= n) {
		lock.lock();
		try {
			while( ((count.get() % 5) != 0) || ((count.get() % 3) != 0))  {
				if(count.get() == n) {
					return;
				}
				cond.await();
			}
			if(count.get() == n) {
				System.out.print("fizzBuzz.");
				return;
			} else {
				System.out.print("fizzBuzz, ");
				count.getAndIncrement();
			}
		} catch(InterruptedException e) {
				System.out.println("exc");
		} finally {
			cond.signalAll();
			lock.unlock();
		}
		}
	}
	
	public  void number() {
		while(count.get() <= n) {
		lock.lock();
		try {
			while( ((count.get() % 5) == 0) || ((count.get() % 3) == 0))  {
				if(count.get() == n) {
					return;
				}
				cond.await();
			}
			if(count.get() == n) {
				System.out.print(count.get() + ".");
				return;
			} else {
				System.out.print(count.get() + ", ");
				count.getAndIncrement();
			}
		} catch(InterruptedException e) {
				System.out.println("exc");
		} finally {
			cond.signalAll();
			lock.unlock();
		}
		}
	}
}
