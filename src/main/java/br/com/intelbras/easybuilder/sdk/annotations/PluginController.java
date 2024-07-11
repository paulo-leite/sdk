package br.com.intelbras.easybuilder.sdk.annotations;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * This annotation is used to define the input facade for plugin operations.
 * The class where this annotation is used must contain the all the entry
 * methods for the plugin’s operations.
 *
 * @author Virtus
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Component
public @interface PluginController {
    /**
     * @return The plugin identifier.
     */
    @AliasFor(annotation = Component.class, attribute = "value")
    String id();

    /**
     * @return The plugin name.
     */
    String name();

    /**
     * @return The plugin description.
     */
    String description();

    /**
     * @return The plugin version.
     */
    String version();
}
