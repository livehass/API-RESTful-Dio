package dio.api_rest.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API RESTful Dio bootcamp Avanade created by Jorge Felipe")
                        .version("1.0")
                        .description("This project is a RESTful API developed in Java using the Spring Boot framework. The API is configured to use Springdoc OpenAPI to generate endpoint documentation in Swagger UI. The project is managed with Gradle"));
    }
}