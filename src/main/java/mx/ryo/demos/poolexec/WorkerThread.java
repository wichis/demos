package mx.ryo.demos.poolexec;

import mx.ryo.demos.forkjoin.Sleeper;

public class WorkerThread implements Runnable {

	private String command;

	public WorkerThread(String s) {
		this.command = s;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start. Command = " + command);
		processCommand();
		System.out.println(Thread.currentThread().getName() + " End.");
	}

	private void processCommand() {
		new Sleeper("yola").procesar();
	}

	@Override
	public String toString() {
		return this.command;
	}
}