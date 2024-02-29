package primeiro.primeiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "primeiro.primeiro")
public class PrimeiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroApplication.class, args);
	}

}
