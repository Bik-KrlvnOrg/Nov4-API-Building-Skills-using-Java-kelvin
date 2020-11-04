package com.example.api.model;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import javax.persistence.Embeddable;
import javax.persistence.Id;

@Root(name = "dateOfBirthItem")
@Data
@Embeddable
public class Dob {
    @Id
    @Element(required = false)
    private String uid;

    @Element(required = false)
    private String dateOfBirth;

    @Element(required = false)
    private String mainEntry;

    @Override
    public String toString() {
        return "Dob{" +
                "uid='" + uid + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", mainEntry='" + mainEntry + '\'' +
                '}';
    }
}
