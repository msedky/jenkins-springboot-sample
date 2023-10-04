package org.testjenkinsgithub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestJenkinsGithubApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(TestJenkinsGithubApplication.class);

	public static void main(String[] args) {
		LOGGER.info("it is a continous integration job,.....");
		SpringApplication.run(TestJenkinsGithubApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("it is my second logger, args = " + args);
	}

}
