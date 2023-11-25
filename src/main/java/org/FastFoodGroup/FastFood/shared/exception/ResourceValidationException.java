package org.FastFoodGroup.FastFood.shared.exception;

import jakarta.validation.ConstraintViolation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * Exception class for signaling that a resource validation has failed.
 * This exception is typically thrown when there are validation constraints violated
 * while creating or updating a resource in the system.
 *
 * @author Mauricio Oliveira Paucar
 * @author Sebastian Castro Soto
 * @author Jean Carlos Achamizo Huamani
 * @author Nicolás Zagal Vallejo
 * @since 1.0
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ResourceValidationException extends RuntimeException {

    /**
     * Constructs a ResourceValidationException with the specified resource name and custom message.
     *
     * @param resourceName The name of the resource for which validation failed
     * @param message      A custom message describing the validation failure
     */
    public ResourceValidationException(String resourceName, String message) {
        super(resourceName + ": " + message);
    }

    /**
     * Constructs a ResourceValidationException with the specified resource name and a set of constraint violations.
     *
     * @param <T>           The type of the resource
     * @param resourceName  The name of the resource for which validation failed
     * @param violations    The set of constraint violations
     */
    public <T> ResourceValidationException(String resourceName, Set<ConstraintViolation<T>> violations) {
        super(violations.stream()
                .map(violation -> String.format("%s : %s", violation.getPropertyPath(), violation.getMessage()))
                .collect(Collectors.joining(", ")));
    }

    /**
     * Overrides the fillInStackTrace method to prevent capturing the stack trace,
     * as it is not needed in this context.
     *
     * @return null to omit the stack trace
     */
    @Override
    public synchronized Throwable fillInStackTrace() {
        return null;
    }
}

