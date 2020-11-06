package com.example.api.model;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;

@Root(name = "placeOfBirthItem")
@Data
public class PlaceOfBirth implements Serializable {
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
