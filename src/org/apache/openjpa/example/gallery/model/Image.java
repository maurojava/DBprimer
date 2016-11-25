/*
 

package org.apache.openjpa.example.gallery.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Image {

    private long id;
    private ImageType type;
    private String fileName;
    private byte[] data;

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @NotNull(message="Image type must be specified.")
    @Enumerated(EnumType.STRING)
    public ImageType getType() {
        return type;
    }

    public void setType(ImageType type) {
        this.type = type;
    }

    @Pattern(regexp = ".*\\.jpg|.*\\.jpeg|.*\\.gif",
             message="Only images of type JPEG or GIF are supported.")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}

 */