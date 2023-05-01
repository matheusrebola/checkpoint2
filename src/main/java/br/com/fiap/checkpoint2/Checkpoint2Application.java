package br.com.fiap.checkpoint2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Checkpoint2Application implements CommandLineRunner {
	private static Logger LOG = LoggerFactory.getLogger(Checkpoint2Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Checkpoint2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		LOG.info("Application: Checkpoint2 is running!");
	}
}
