package pe.edu.upc.urpetapi;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@SecurityScheme(name = "Bearer Authentication", type = SecuritySchemeType.APIKEY, bearerFormat = "JWT", scheme = "bearer")
public class UrpetapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UrpetapiApplication.class, args);
    }

}
