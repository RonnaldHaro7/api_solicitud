package uic.api_solicitud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ApiSolicitudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSolicitudApplication.class, args);
	}

}
