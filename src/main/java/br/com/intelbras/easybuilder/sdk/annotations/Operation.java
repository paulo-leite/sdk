package br.com.intelbras.easybuilder.sdk.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used in methods to define the name
 * of the operation that the method is performing.
 *
 * @author Virtus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Operation {
    /**
     * @return The operation name
     */
    String name();
}
