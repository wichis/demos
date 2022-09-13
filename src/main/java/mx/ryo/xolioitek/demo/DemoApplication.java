package mx.ryo.xolioitek.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	final static int SIZE_POOL_MAX = 10;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);

	}

}
