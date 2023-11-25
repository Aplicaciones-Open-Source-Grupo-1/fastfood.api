package org.FastFoodGroup.FastFood.shared.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for creating and initializing the EnhancedModelMapper bean.
 * This class is responsible for defining and configuring the EnhancedModelMapper bean
 * to be used for object mapping within the Fast Food application.
 *
 * @author Mauricio Oliveira Paucar
 * @author Sebastian Castro Soto
 * @author Jean Carlos Achamizo Huamani
 * @author Nicolás Zagal Vallejo
 * @since 1.0
 */
@Configuration("enhancedModelMapperConfiguration")
public class MappingConfiguration {

    /**
     * Creates and configures the EnhancedModelMapper bean.
     *
     * @return The configured EnhancedModelMapper bean
     */
    @Bean
    public EnhancedModelMapper modelMapper() {
        return new EnhancedModelMapper();
    }
}

