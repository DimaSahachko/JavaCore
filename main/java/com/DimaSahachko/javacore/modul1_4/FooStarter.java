package main.java.com.DimaSahachko.javacore.modul1_4;
/*In order to provide the order of threads execution join() method is used*/

class Foo {
	public void first() {
		System.out.print("first");
	}
	public void second() {
		System.out.print("second");
	}
	public void third() {
		System.out.print("third");
	}
}

public class FooStarter {
	public static void main(String[] args) {
		Foo foo = new Foo();
		Thread t1 = new Thread(() -> {
			foo.first();
		}
		);
		
		Thread t2 = new Thread(() -> {
			try{
				t1.join();
			} catch (InterruptedException e) {
				System.out.println("Exception has been caught");
			}
			foo.second();
		}
		);
		
		Thread t3 = new Thread(() -> {
			try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				System.out.println("Exception has been caught");
			}
			foo.third();
		}
		);
		t1.start();
		t2.start();
		t3.start();
	}
}