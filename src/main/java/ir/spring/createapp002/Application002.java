package ir.spring.createapp002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class
		,HibernateJpaAutoConfiguration.class,
		})
public class Application002 {

	public static void main(String[] args) {
		SpringApplication.run(Application002.class,args);
	}

}
