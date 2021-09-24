package bo.ucb.edu.gymback;

import bo.ucb.edu.gymback.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "bo.ucb.edu.gymback.dao")
@EnableAutoConfiguration(
		exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class GymBackApplication {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(GymBackApplication.class, args);
	}

}
