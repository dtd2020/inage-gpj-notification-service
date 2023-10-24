package mz.gov.inagegpjnotificationservice.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfiguration {
    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Módulo de Notificação - Provedor de Justiça")
                        .version("v1.0")
                        .description("Provedor de Justiça")
                        .termsOfService("https://github.com/e1000son")
                        .license(new License().name("Apache 2.0")
                                .url("https://github.com/e1000son"))
                );

    }
}
