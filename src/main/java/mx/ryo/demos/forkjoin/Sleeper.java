package mx.ryo.demos.forkjoin;

public class Sleeper {
	private final int min = 1;// seconds
	private final int max = 15;// seconds

	private String name = "Sleeper: ";
	private int randomTime = 0;

	public Sleeper(String name) {
		this.name = this.name.concat(name);
		// Generate random int value from 50 to 100
		this.randomTime = (int) Math.floor(Math.random() * (max - min + 1) + min);
	}

	public void procesar() {
		try {
			System.out.println(this.name + " will sleep for "+this.randomTime+" seconds");
			Thread.sleep(randomTime * 1000);
			System.out.println(this.name + " is wake up.");

		} catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}
	}
}
