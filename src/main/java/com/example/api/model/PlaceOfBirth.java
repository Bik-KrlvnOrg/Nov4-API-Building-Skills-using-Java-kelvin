package com.example.api.model;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import javax.persistence.Embeddable;

@Root(name = "placeOfBirthItem")
@Data
@Embeddable
public class PlaceOfBirth {
    @Element(required = false)
    private String uid;

    @Element(required = false)
    private String placeOfBirth;

    @Element(required = false)
    private String mainEntry;

    @Override
    public String toString() {
        return "PlaceOfBirth{" +
                "uid='" + uid + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", mainEntry='" + mainEntry + '\'' +
                '}';
    }
}
