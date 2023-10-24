package mz.gov.inagegpjnotificationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class InageGpjNotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InageGpjNotificationServiceApplication.class, args);
	}

}
