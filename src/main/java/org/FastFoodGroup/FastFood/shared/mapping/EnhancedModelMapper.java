package org.FastFoodGroup.FastFood.shared.mapping;

import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Extended ModelMapper class with additional functionality for mapping collections.
 * This class provides a method to map a list of source objects to a list of target objects.
 *
 * @author Mauricio Oliveira Paucar
 * @author Sebastian Castro Soto
 * @author Jean Carlos Achamizo Huamani
 * @author Nicolás Zagal Vallejo
 * @since 1.0
 */
public class EnhancedModelMapper extends ModelMapper {

    /**
     * Default constructor for EnhancedModelMapper.
     */
    public EnhancedModelMapper() {
        super();
    }

    /**
     * Maps a list of source objects to a list of target objects.
     *
     * @param <S>          The type of the source objects
     * @param <T>          The type of the target objects
     * @param sourceList   The list of source objects
     * @param targetClass  The class of the target objects
     * @return List of target objects mapped from the source list
     */
    public <S, T> List<T> mapList(List<S> sourceList, Class<T> targetClass) {
        return sourceList.stream()
                .map(item -> this.map(item, targetClass))
                .collect(Collectors.toList());
    }
}
