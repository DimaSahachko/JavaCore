package main.java.com.DimaSahachko.javacore.modul1_4;
import java.util.concurrent.*;

public class FooStarter {

	public static void main(String[] args) {
		Foo f = new Foo();
		CompletableFuture.runAsync(() -> f.third());
		CompletableFuture.runAsync(() -> f.second());
		CompletableFuture.runAsync(() -> f.first());
	}
}
class Foo {
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