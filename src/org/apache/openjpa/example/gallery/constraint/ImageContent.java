/*package org.apache.openjpa.example.gallery.constraint;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.apache.openjpa.example.gallery.model.ImageType;

@Documented
@Constraint(validatedBy = ImageContentValidator.class)
@Target({ METHOD, FIELD })
@Retention(RUNTIME)
public @interface ImageContent {
    String message() default "Image data is not a supported format.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    ImageType[] value() default { ImageType.GIF, ImageType.JPEG };
}
*/