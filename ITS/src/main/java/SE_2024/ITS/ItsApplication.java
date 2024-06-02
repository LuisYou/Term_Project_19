package SE_2024.ITS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ItsApplication {
	public static void main(String[] args) {
		SpringApplication.run(ItsApplication.class, args);
	}
}
