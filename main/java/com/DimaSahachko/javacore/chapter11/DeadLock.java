package main.java.com.DimaSahachko.javacore.chapter11;

class A {
	synchronized void foo(B b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered method A.foo()");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Class A has been interrupted");
		}
		System.out.println(name + " trying to call method B.last()");
		b.last();
	}
	
	synchronized void last() {
		System.out.println("In the method B.last()");
	}
}

class B {
	synchronized void bar(A a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered method B.bar()");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Class B has been interrupted");
		}
		System.out.println(name + " trying to call method A.last()");
		a.last();
	}
	
	synchronized void last() {
		System.out.println("In the method A.last()");
	}
}

public class DeadLock implements Runnable {
	A a = new A();
	B b = new B();
	DeadLock() {
		Thread.currentThread().setName("Main thread");
		Thread t = new Thread(this, "Competetive thread");
		t.start();
		
		a.foo(b);
		System.out.println("Back to main thread");
	}
	
	public void run() {
		b.bar(a);
		System.out.println("back to competetive thread");
	}
	public static void main(String[] args) {
		new DeadLock();
	}

}
