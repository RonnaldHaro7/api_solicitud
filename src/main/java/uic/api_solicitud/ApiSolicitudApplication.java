package uic.api_solicitud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@OpenAPIDefinition
@SpringBootApplication
public class ApiSolicitudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSolicitudApplication.class, args);
	}

}
