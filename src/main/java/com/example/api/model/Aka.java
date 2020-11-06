package com.example.api.model;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Root(name = "aka")
@Data
public class Aka implements Serializable {
    @Element(required = false)
    private String uid;

    @Element(required = false)
    private String type;

    @Element(required = false)
    private String category;

    @Element(required = false)
    private String lastName;

    @Element(required = false)
    private String firstName;

    @Override
    public String toString() {
        return "Aka{" +
                "uid='" + uid + '\'' +
                ", type='" + type + '\'' +
                ", category='" + category + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
