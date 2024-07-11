package br.com.intelbras.easybuilder.sdk.annotations;

import br.com.intelbras.easybuilder.sdk.annotations.enums.FormControlsType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used in parameters to define an alias
 * that will be exposed in place of the parameter name.
 *
 * @author Virtus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface Param {
    /**
     * @return The parameter name
     */
    String name();

    FormControlsType type() default FormControlsType.UNSPECIFIED;
}
