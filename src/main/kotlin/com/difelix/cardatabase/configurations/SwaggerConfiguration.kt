package com.difelix.cardatabase.configurations

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType
import io.swagger.v3.oas.annotations.security.SecurityScheme
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@SecurityScheme(name = "basicAuth", type = SecuritySchemeType.HTTP, scheme = "basic")
class SwaggerConfiguration {

   @Bean
   fun springDocConfig() = OpenAPI()
           .info(Info().title("Banco de dados de carros")
                   .description("Banco de dados de carros")
                   .version("v1.0"))
}