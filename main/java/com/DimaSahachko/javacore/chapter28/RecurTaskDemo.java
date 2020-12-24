/*package main.java.com.DimaSahachko.javacore.chapter28;
import java.util.concurrent.*;
class Sum extends RecursiveTask<Double> {
	double[] data;
	int start;
	int end;
	int seqThreshold = 500;
	Sum(double[] d, int s, int e) {
		data = d;
		start = s;
		end = e;
	}
	protected Double compute() {
		double sum = 0;
		if((end - start) < seqThreshold) {
			for(int i = start; i < end; i++) {
				sum += data[i];
			}
		} else {
			int middle = (start + end) / 2;
			Sum sub1 = new Sum(data, start, middle);
			Sum sub2 = new Sum(data, middle, end);
			sub1.fork();
			sub2.fork();
			sum = sub1.join() + sub2.join();
		}
		return sum;
	}
}

public class RecurTaskDemo {
	public static void main(String[] args) {
		double[] arr = new double[5000];
		for(int i = 0; i < arr.length; i++) {
			if((i % 2) == 0) {
				arr[i] = i;
			} else {
				arr[i] = -i;
			}
		}
		ForkJoinPool fjp = new ForkJoinPool();
		Sum task = new Sum(arr, 0, arr.length);
		double s = fjp.invoke(task);
		System.out.println(s);
	}

}*/
