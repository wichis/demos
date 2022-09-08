package mx.ryo.demos.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoin {

	public static final void subscribe() {
		ForkJoinPool commonPool = ForkJoinPool.commonPool();
		int[] arrayNums = { 1, 2, 3 };
		CustomRecursiveTask crt = new CustomRecursiveTask(arrayNums);
		commonPool.invoke(crt);
		System.out.println("A portion of the transformed sequence" + " (to four decimal places): ");
		for (int i = 0; i < 9; i++) {
			System.out.printf("%.4f ", arrayNums[i]);
		}
		System.out.println();
	}
}
