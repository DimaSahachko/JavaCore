package main.java.com.DimaSahachko.javacore.chapter28;
import java.util.concurrent.*;
public class CallableDemo {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);
		Future<Integer> sum;
		Future<Double> hyp;
		Future<Integer> fact;
		
		System.out.println("Starting");
		sum = es.submit(new Sum(10));
		hyp = es.submit(new Hypot(3, 4));
		fact = es.submit(new Factorial(5));
		
		try {
			System.out.println(sum.get());
			System.out.println(hyp.get());
			System.out.println(fact.get());
		} catch (InterruptedException | ExecutionException e) {
			System.out.println("exc");
		}
		es.shutdown();
		System.out.println("Done");
	}

}
class Sum implements Callable<Integer> {
	int stop;
	Sum(int stop) {
		this.stop = stop;
	}
	public Integer call() {
		int sum = 0;
		for(int x = 0; x <= stop; x++) {
			sum+= x;
		}
		return sum;
	}
}
class Hypot implements Callable<Double> {
	double side1, side2;
	Hypot(double s1, double s2) {
		side1 = s1;
		side2 = s2;
	}
	public Double call() {
		return Math.sqrt((side1 * side1) + (side2 * side2));
	}
	
}
class Factorial implements Callable<Integer> {
	int stop;
	Factorial(int v) {
		stop = v;
	}
	public Integer call() {
		int fact = 1;
		for(int i = 2; i <= stop; i++) {
			fact *= i;
		}
		return fact;
	}
}
