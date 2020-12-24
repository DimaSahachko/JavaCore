package main.java.com.DimaSahachko.javacore.chapter28;
import java.util.concurrent.*;
public class SimpExec {

	public static void main(String[] args) {
		CountDownLatch cdl = new CountDownLatch(5);
		CountDownLatch cdl2 = new CountDownLatch(5);
		CountDownLatch cdl3 = new CountDownLatch(5);
		CountDownLatch cdl4 = new CountDownLatch(5);
		CountDownLatch cdl5 = new CountDownLatch(5);
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		es.execute(new MyThread5(cdl, "A"));
		es.execute(new MyThread5(cdl2, "B"));
		es.execute(new MyThread5(cdl3, "C"));
		es.execute(new MyThread5(cdl4, "D"));
		es.execute(new MyThread5(cdl5, "E"));
		
		try {
			cdl.await();
			cdl2.await();
			cdl3.await();
			cdl4.await();
			cdl5.await();
		} catch (InterruptedException e) {
			
		}
		
	//	es.shutdown();
		System.out.println("Done");
	}

}

class MyThread5 implements Runnable{
		CountDownLatch latch;
		String name;
		MyThread5(CountDownLatch l, String n) {
			latch = l;
			name = n;
		}
		public void run() {
			for(int i = 0; i < 5; i++) {
				System.out.println(name + ": " + i + " . Thread - " + Thread.currentThread().getName());
				latch.countDown();
			}
		}
}
