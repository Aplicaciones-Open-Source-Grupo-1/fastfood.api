package org.FastFoodGroup.FastFood.shared.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for OpenAPI documentation in the Fast Food application.
 * This class defines the custom OpenAPI configuration, including application description and version.
 *
 * @author Mauricio Oliveira Paucar
 * @author Sebastian Castro Soto
 * @author Jean Carlos Achamizo Huamani
 * @author Nicolás Zagal Vallejo
 * @since 1.0
 */
@Configuration
public class OpenApiConfiguration {

    /**
     * Creates a custom OpenAPI configuration.
     *
     * @param applicationDescription The description of the Fast Food application
     * @param applicationVersion     The version of the Fast Food application
     * @return The custom OpenAPI configuration
     */
    @Bean
    public OpenAPI customOpenApi(
            @Value("${documentation.application.description}") String applicationDescription,
            @Value("${documentation.application.version}") String applicationVersion) {

        // Create OpenAPI instance with custom information
        return new OpenAPI()
                .info(new Info()
                        .title("Fast Food API")
                        .version(applicationVersion)
                        .description(applicationDescription)
                        .contact(new Contact()
                                .name("Fast Food Team")
                                .email("fastfood@example.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://www.apache.org/licenses/LICENSE-2.0")));
    }
}

