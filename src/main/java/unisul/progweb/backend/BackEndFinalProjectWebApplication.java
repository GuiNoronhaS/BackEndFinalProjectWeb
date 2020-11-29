package unisul.progweb.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="unisul.progweb.repository")
public class BackEndFinalProjectWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackEndFinalProjectWebApplication.class, args);
	}

}
