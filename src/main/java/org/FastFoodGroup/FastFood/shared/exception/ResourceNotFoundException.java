package org.FastFoodGroup.FastFood.shared.exception;

/**
 * Exception class for signaling that a requested resource was not found.
 * This exception is typically thrown when attempting to retrieve or manipulate a resource
 * that does not exist in the system.
 *
 * @author Mauricio Oliveira Paucar
 * @author Sebastian Castro Soto
 * @author Jean Carlos Achamizo Huamani
 * @author Nicolás Zagal Vallejo
 * @since 1.0
 */
public class ResourceNotFoundException extends RuntimeException {

    /**
     * Constructs a ResourceNotFoundException with the specified resource name and identifier.
     *
     * @param resourceName The name of the resource that was not found
     * @param resourceId   The identifier of the resource that was not found
     */
    public ResourceNotFoundException(String resourceName, Integer resourceId) {
        super(String.format("%s with id %d not found.", resourceName, resourceId));
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

