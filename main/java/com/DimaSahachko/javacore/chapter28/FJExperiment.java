package main.java.com.DimaSahachko.javacore.chapter28;
import java.util.concurrent.*;

class Transform extends RecursiveAction{
	int seqThreshold;
	int start;
	int end;
	double[] data;
	Transform(double[] d, int s, int e, int threshold) {
		data = d;
		start = s;
		end = e;
		seqThreshold = threshold;
	}
	
	protected void compute() {
		if((end - start) < seqThreshold) {
			for(int i = start; i < end; i++) {
				if((i % 2) == 0) {
					data[i] = Math.sqrt(data[i]);
				} else {
					data[i] = Math.cbrt(data[i]);
				}
			}
		} else {
			int medium = (start + end) / 2;
			invokeAll(new Transform(data, start, medium, seqThreshold), new Transform(data, medium, end, seqThreshold));
		}
	}
}

public class FJExperiment {

	public static void main(String[] args) {
		int pLevel;
		int threshold;
		if(args.length != 2) {
			System.out.println("Fault");
			return;
		}
		pLevel = Integer.parseInt(args[0]);
		threshold = Integer.parseInt(args[1]);
		long beginT, endT;
		double[] arr = new double[1000000];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (double) i;
		}
		ForkJoinPool fjp = new ForkJoinPool(pLevel);
		Transform task = new Transform(arr, 0, arr.length, threshold);
		beginT = System.nanoTime();
		fjp.invoke(task);
		endT = System.nanoTime();
		System.out.println("Lvl of paralelism " + pLevel);
		System.out.println("Threshold " + threshold);
		System.out.println("Time " + (endT-beginT) + "ns");
		
	}

}
