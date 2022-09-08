package mx.ryo.xolioit.auth.conf;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mx.ryo.demos.forkjoin.ForkJoin;
import mx.ryo.demos.forkjoin.Sleeper;
import mx.ryo.demos.poolexec.WorkerThread;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("Initialization");
		long init = System.currentTimeMillis();
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable worker = new WorkerThread("" + i);
			executor.execute(worker);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		long end = System.currentTimeMillis();
		System.out.println("Finished all threads");
		System.out.println("Time finishing: "+(end - init)/1000+" seconds");

	}

}
