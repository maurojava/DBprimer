/*
package org.apache.openjpa.example.gallery.constraint;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.openjpa.example.gallery.model.ImageType;


public class ImageContentValidator implements ConstraintValidator<ImageContent, byte[] {

    private List<ImageType> allowedTypes = null;

  
    public void initialize(ImageContent constraint) {
        allowedTypes = Arrays.asList(constraint.value());
    }

   
    public boolean isValid(byte[] value, ConstraintValidatorContext context) {
        if (value == null) {
            return false;
        }
        // Verify the GIF header is either GIF87 or GIF89
        if (allowedTypes.contains(ImageType.GIF)) {
            String gifHeader = new String(value, 0, 6);
            if (value.length >= 6
                    && (gifHeader.equalsIgnoreCase("GIF87a")
                    || gifHeader.equalsIgnoreCase("GIF89a"))) {
                return true;
            }
        }
        // Verify the JPEG begins with SOI & ends with EOI
        if (allowedTypes.contains(ImageType.JPEG)) {
            if (value.length >= 4
                    && value[0] == 0xff && value[1] == 0xd8
                    && value[value.length - 2] == 0xff
                    && value[value.length - 1] == 0xd9) {
                return true;
            }
        }
        // Unknown file format
        return false;
    }
}

*/