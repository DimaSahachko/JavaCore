package main.java.com.DimaSahachko.javacore.modul1_4;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.*;
public class FooStarter2 {

	public static void main(String[] args) {
		Foo2 f = new Foo2();
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.submit(() -> f.first());
		es.submit(() -> f.second());
		es.submit(() -> f.third());
		es.shutdown();
	}
}
class Foo2 {
	Semaphore forSecond = new Semaphore(0);
	Semaphore forThird = new Semaphore(0);
	
	public void first() {
		System.out.println("first");
		forSecond.release();
	}
	
	public void second() {
		try{
			forSecond.acquire();
		} catch(InterruptedException e) {
			System.out.println("exc");
		}
		System.out.println("second");
		forThird.release();
	}
	
	public void third(){
		try {
			forThird.acquire();
		} catch(InterruptedException e) {
			System.out.println("exc");
		}
		System.out.println("third");
	}
}