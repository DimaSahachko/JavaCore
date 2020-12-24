package main.java.com.DimaSahachko.javacore.modul1_4;

import java.util.concurrent.atomic.AtomicInteger;
/*At the outset I inform that code works incorrect in some cases: the last figure not always prints(figure that equals N)
 * The main idea is: we have a shared resource few threads have access to. And every of these threads increments a shared variable. In order to
 * provide visibility and correctly performance I've used atomic class AtomicInteger.
 */

class FizzBuzz {
	int n;
	AtomicInteger count = new AtomicInteger(1);
	
	public FizzBuzz(int n) {
		this.n = n;
	}
	/*Every of the following methods checks out truthfulness of certain condition and if this condition is false we call return. In true case this
	 * method prints output and increment count variable*/
	public synchronized void fizz() {
		if( (((count.get() % 5) == 0) && ((count.get() % 3) == 0)) ||  (count.get() % 3) != 0  ) {
			return;
		}
		if(count.get() == n) {
			System.out.print("fizz.");
			return;
		} else {
			System.out.print("fizz, ");
			count.getAndIncrement();
		}
	}
	public synchronized void buzz() {
		if( (((count.get() % 5) == 0) && ((count.get() % 3) == 0)) ||  (count.get() % 5) != 0  ) {
			return;
		}
		if(count.get() == n) {
			System.out.print("buzz.");
			return;
		} else {
			System.out.print("buzz, ");
			count.getAndIncrement();
		}
	}
	
	public synchronized void fizzBuzz() {
		if( ((count.get() % 5) != 0) || ((count.get() % 3) != 0)) {
			return;
		}
		if(count.get() == n) {
			System.out.print("fizzbuzz.");
			return;
		} else {
			System.out.print("fizzbuzz, ");
			count.getAndIncrement();
		}
	}
	
	public synchronized void number() {
		if(((count.get() % 5) == 0) || ((count.get() % 3) == 0)) {
			return;
		}
		if(count.get() == n) {
			System.out.print(count.get() + ".");
			return;
		} else {
			System.out.print(count.get() + ", ");
			count.getAndIncrement();
		}
	}
}

public class FizzBuzzStarter {

	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz(15);
		Thread t1 = new Thread(() -> {
			while(fb.count.get() < fb.n)
				fb.fizz();
		});
		Thread t2 = new Thread(() -> {
			while(fb.count.get() < fb.n)
			fb.buzz();
		});
		Thread t3 = new Thread(() -> {
			while(fb.count.get() < fb.n)
			fb.fizzBuzz();
		});
		Thread t4 = new Thread(() -> {
			while(fb.count.get() < fb.n)
			fb.number();
		});
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
