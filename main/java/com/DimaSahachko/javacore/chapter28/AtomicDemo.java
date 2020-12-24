package main.java.com.DimaSahachko.javacore.chapter28;
import java.util.concurrent.atomic.*;
public class AtomicDemo {

	public static void main(String[] args) {
		new Thread(new AtomThread("A")).start();
		new Thread(new AtomThread("B")).start();
		new Thread(new AtomThread("C")).start();
	}

}
class Shared3{
	static AtomicInteger ai = new AtomicInteger(0); 
}
class AtomThread implements Runnable {
	String name;
	AtomThread(String n) {
		name = n;
	}
	public void run() {
		System.out.println(name + " is starting");
		for(int i = 1; i < 4; i++) {
			System.out.println(name + " got: " + Shared3.ai.getAndSet(i));
		}
	}
}