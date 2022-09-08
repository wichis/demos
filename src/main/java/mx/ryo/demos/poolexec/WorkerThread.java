package mx.ryo.demos.poolexec;

import mx.ryo.demos.forkjoin.Sleeper;

public class WorkerThread implements Runnable {

	private String command;
	private String result;

	public WorkerThread(String s) {
		this.command = s;
		this.result = "RUNNING";
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start. Command = " + command);
		processCommand();
		System.out.println(Thread.currentThread().getName() + " End.");
		this.result = "OK";
	}

	private void processCommand() {
		new Sleeper("yola").procesar();
	}

	@Override
	public String toString() {
		return this.command;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	
}