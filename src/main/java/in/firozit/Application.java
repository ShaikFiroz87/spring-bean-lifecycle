package in.firozit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("----------------------------- (( Before IoC Initialized ))--------------------------------");
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("----------------------------- (( After IoC Initialized ))--------------------------------");
	}
}
