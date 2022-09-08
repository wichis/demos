package mx.ryo.xolioit.auth.conf;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mx.ryo.demos.forkjoin.ForkJoin;
import mx.ryo.demos.forkjoin.Sleeper;
import mx.ryo.demos.poolexec.WorkerThread;

@SpringBootApplication
public class DemoApplication {
	final static int  SIZE_POOL_MAX = 10;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("Initialization");
		System.out.println("=====================");
		
		long init = System.currentTimeMillis();
		String[] calls = {"Calling-1", "Calling-2", "Calling-3"};
		if (calls.length == 0) throw new Exception("Las llamdas deben ser mayor a cero");
		ExecutorService executor = Executors.newFixedThreadPool(calls.length < SIZE_POOL_MAX? calls.length : SIZE_POOL_MAX);
		List<Runnable> workers = new ArrayList<>();
		for (int i = 0; i < calls.length; i++) {
			Runnable worker = new WorkerThread(calls[i]);
			executor.execute(worker);
			workers.add(worker);

		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		long end = System.currentTimeMillis();
		System.out.println("=====================");
		System.out.println("Finished all threads");
		for(Runnable workIt : workers) {
			System.out.print(" " + ((WorkerThread)workIt).getResult()  );
		}
		System.out.println("Time finishing: "+(end - init)/1000+" seconds");

	}

}
