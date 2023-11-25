package org.FastFoodGroup.FastFood.shared.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configuration class for Cross-Origin Resource Sharing (CORS) in the Fast Food application.
 * This class enables CORS globally for the entire application.
 * It allows requests from any origin, with specified methods, headers, and supports credentials.
 *
 * @author Mauricio Oliveira Paucar
 * @author Sebastian Castro Soto
 * @author Jean Carlos Achamizo Huamani
 * @author Nicolás Zagal Vallejo
 * @since 1.0
 */
@Configuration
@EnableWebMvc
public class CorsConfiguration implements WebMvcConfigurer {

    /**
     * Adds CORS mappings to the provided CorsRegistry.
     *
     * @param registry The CorsRegistry to which CORS mappings are added
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*") // Allows requests from any origin
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Specifies allowed HTTP methods
                .allowedHeaders("*") // Allows all headers
                .allowCredentials(true); // Supports credentials (e.g., cookies)
    }
}
