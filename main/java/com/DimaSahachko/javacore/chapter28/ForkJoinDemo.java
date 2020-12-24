package main.java.com.DimaSahachko.javacore.chapter28;
import java.util.concurrent.*;

class SqrtTransform extends RecursiveAction {
	final int seqThreshold = 1000;
	double[] data;
	int start, end;
	
	SqrtTransform(double[] data, int s, int e) {
		this.data = data;
		start = s;
		end = e;
	}
	protected void compute() {
		if((end - start) < seqThreshold) {
			for(int i = start; i < end; i++) {
				data[i] = Math.sqrt(data[i]);
			}
		} else {
			int middle = (start + end) / 2;
			invokeAll(new SqrtTransform(data, start, middle), new SqrtTransform(data, middle, end));
		}
	}
}

public class ForkJoinDemo {

	public static void main(String[] args) {
		ForkJoinPool fjp = new ForkJoinPool();
		double[] arr = new double[10000];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (double) i;
		}
		System.out.println("Print portion of the original sequence");
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		
		SqrtTransform trans = new SqrtTransform(arr, 0, arr.length);
		fjp.execute(trans);
		
		System.out.println("Print portion of the transformed sequece:");
		for(int i = 0; i < 10; i++) {
			System.out.format("%.4f ", arr[i]);
		}
	}

}
